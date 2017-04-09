package bookConfirm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import screenFramework.ScreenController;
import secondPage.BookSecondPageController;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;

public class BookConfirmController implements Initializable, screenFramework.ControlledScreen{
	//BookSecondPageController BS = new BookSecondPageController();
	ScreenController myController;
	
	@FXML
	private Button back;
	@FXML
	private Button Confirm;
	@FXML
	private ImageView thanks;
	// Event Listener on Button[#back].onAction
	
	@FXML
	private Label subj;
	
	
	@FXML
	private JFXTextField getSname;
	
	
	/**
	 * @param subject the subject to set
	 */
	public void text(){
		//getSname.setText(BS.subject.getText());
	}
	@FXML
	public void openBookSecondPage(ActionEvent event) throws Exception {               

			 myController.setScreen(screenFramework.ScreensFramework.screen3ID);		
	}
	
	@FXML
	public void OpenThanks(ActionEvent event){
		myController.setScreen(screenFramework.ScreensFramework.screen6ID);
	}

	
	public void setScreenParent(ScreenController screenParent) {
		 myController = screenParent;
		
	}

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}
