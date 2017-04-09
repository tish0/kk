/**
 * 
 */
package screenFramework;

import java.util.HashMap;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;
import screenFramework.ControlledScreen;

/**
 * @author Tihomir Penev
 *
 */
public class ScreenController extends StackPane {

	private HashMap<String, Node> screens = new HashMap<>();
	
	public ScreenController(){
		super();
	}
	
	
	public void addScreen(String name, Node screen){
		screens.put(name, screen);
	}
	
	public Node getScreen(String name){
		return screens.get(name);
	}
	
	public boolean loadScreen(String name, String resource) {
        try {
            FXMLLoader myLoader = new FXMLLoader(getClass().getResource(resource));
            Parent loadScreen = (Parent) myLoader.load();
            ControlledScreen myScreenControler = ((ControlledScreen) myLoader.getController());
            myScreenControler.setScreenParent(this);
            
            addScreen(name, loadScreen);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
	 
	 public boolean setScreen(final String name) {       
	        if (screens.get(name) != null) {   //screen loaded
	            final DoubleProperty opacity = opacityProperty();

	            if (!getChildren().isEmpty()) {    //if there is more than one screen
	                Timeline fade = new Timeline(
	                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 1.0)),
	                        new KeyFrame(new Duration(1000), new EventHandler<ActionEvent>() {
	                    @Override
	                    public void handle(ActionEvent t) {
	                        getChildren().remove(0);                    //remove the displayed screen
	                        getChildren().add(0, screens.get(name)); 
	                    //	ScreensFramework.resizeScreen(); //add the screen
	                        Timeline fadeIn = new Timeline(
	                                new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.5)),
	                                new KeyFrame(new Duration(800), new KeyValue(opacity, 1.0)));
	                        fadeIn.play();
	                    }
	                }, new KeyValue(opacity, 0.5)));
	                fade.play();

	            } else {
	                setOpacity(0.0);
	                getChildren().add(screens.get(name));       //no one else been displayed, then just show
	                Timeline fadeIn = new Timeline(
	                        new KeyFrame(Duration.ZERO, new KeyValue(opacity, 0.0)),
	                        new KeyFrame(new Duration(2500), new KeyValue(opacity, 1.0)));
	                fadeIn.play();
	            }
	            return true;
	        } else {
	            System.out.println("screen hasn't been loaded!!! \n");
	            return false;
	        }
	        
	       
	        	
	        	
	        /*Node screenToRemove;
	         if(screens.get(name) != null){   //screen loaded
	         if(!getChildren().isEmpty()){    //if there is more than one screen
	         getChildren().add(0, screens.get(name));     //add the screen
	         screenToRemove = getChildren().get(1);
	         getChildren().remove(1);                    //remove the displayed screen
	         }else{
	         getChildren().add(screens.get(name));       //no one else been displayed, then just show
	         }
	         return true;
	         }else {
	         System.out.println("screen hasn't been loaded!!! \n");
	         return false;
	         }*/
	    }

	    //This method will remove the screen with the given name from the collection of screens
	    public boolean unloadScreen(String name) {
	        if (screens.remove(name) == null) {
	            System.out.println("Screen didn't exist");
	            return false;
	        } else {
	            return true;
	        }
	    }
	}

