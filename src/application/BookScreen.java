package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import database.MysqlConnect;
//import database.MysqlConnect;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import screenFramework.ScreenController;
import screenFramework.ScreensFramework;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TouchEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import secondPage.BookSecondPageController;
import secondPage.*;


public class BookScreen implements Initializable, screenFramework.ControlledScreen {
	
	Connection conn = null;
	ResultSet rs = null;
	ScreenController myController;
	@FXML
	private  ToggleButton bm1;
	@FXML
	private  ToggleButton bm2;
	@FXML
	private  ToggleButton bm3;
	@FXML
	private  ToggleButton bm4;
	@FXML
	private  ToggleButton bm5;
	@FXML
	private  ToggleButton bt1;
	@FXML
	private  ToggleButton bt2;
	@FXML
	private  ToggleButton bt3;
	@FXML
	private  ToggleButton bt4;
	@FXML
	private  ToggleButton bt5;
	@FXML
	private  ToggleButton wb1;
	@FXML
	private  ToggleButton wb2;
	@FXML
	private  ToggleButton wb3;
	@FXML
	private  ToggleButton wb4;
	@FXML
	private  ToggleButton wb5;
	@FXML
	private  ToggleButton th1;
	@FXML
	private  ToggleButton th2;
	@FXML
	private  ToggleButton th3;
	@FXML
	private  ToggleButton th4;
	@FXML
	private  ToggleButton th5;
	@FXML
	private  ToggleButton fb1;
	@FXML
	private  ToggleButton fb2;
	@FXML
	private  ToggleButton fb3;
	@FXML
	private  ToggleButton fb4;
	@FXML
	private  ToggleButton fb5;
	
	
	@FXML
	private Text day1;
	@FXML
	private GridPane showGrid; 
	@FXML
	private Label ltime;
	@FXML
	private Label lprof;
	@FXML
	private Label Please;
		
	@FXML
	private Button hour11;
	@FXML
	private Button hour40;
	@FXML
	private Button btnNext;
	@FXML
	private Button back;
	@FXML
	private ToggleGroup h;
	@FXML
	private ListView<String> listview;
	@FXML
	private MenuButton pp;
								//ontouch event for the koisk
	public void showCoordinators(MouseEvent event) throws SQLException {
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = MysqlConnect.ConnecrDb();
//			
//			System.out.println("Connection form Java FX success!");
//			Statement stmt = conn.createStatement();
//			ResultSet rs = stmt.executeQuery("Select*from Staff");
//			while(rs.next()) {
//				String name = rs.getString("name");
//				ObservableList <String> list = FXCollections.observableArrayList(name);
//				listview.getItems().addAll(list);
				
//				//pp.setText(name);
//				System.out.println(name);
//			}
//
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
				//list with coordinators to be visible
				listview.setVisible(true);
				//setting the lables to be empry after drop down clicked
				ltime.setText("");
				lprof.setText("");
				//set the lables to be visible after dropdown clicked
				ltime.setVisible(true);
		   		lprof.setVisible(true);

	}

	
	@FXML
	public void OpenSecondPage(ActionEvent event) throws Exception {               
		 myController.setScreen(screenFramework.ScreensFramework.screen3ID);
		 listview.setVisible(false);
		 ltime.setVisible(false);
		 lprof.setVisible(false);
		 
}
	@FXML
	public void openWelcome(ActionEvent event) throws Exception {               
		myController.setScreen(screenFramework.ScreensFramework.screen1ID);
		 listview.setVisible(false);
		 ltime.setVisible(false);
		 lprof.setVisible(false);
	}	
	
	

	
	public void setScreenParent(ScreenController screenParent) {
		 myController = screenParent;
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		 
		
		bm1.setOnAction(e->ltime.setText("Selected : Monday 10:00 AM"));
		bm2.setOnAction(e->ltime.setText("Selected : Monday 10:45 AM"));
		bm3.setOnAction(e->ltime.setText("Selected : Monday 11:30 AM"));
		bm4.setOnAction(e->ltime.setText("Selected : Monday 1:00 PM"));
		bm5.setOnAction(e->ltime.setText("Selected : Monday 1:45 AM"));
		bt1.setOnAction(e->ltime.setText("Selected : Tuesday 10:00 AM"));
		bt2.setOnAction(e->ltime.setText("Selected : Tuesday 10:45 AM"));
		bt3.setOnAction(e->ltime.setText("Selected : Tuesday 11:30 AM"));
		bt4.setOnAction(e->ltime.setText("Selected : Tuesday 1:00 PM"));
		bt5.setOnAction(e->ltime.setText("Selected : Tuesday 1:45 PM"));
		wb1.setOnAction(e->ltime.setText("Selected : Wednesday 10:00 AM"));
		wb2.setOnAction(e->ltime.setText("Selected : Wednesday 10:45 AM"));
		wb3.setOnAction(e->ltime.setText("Selected : Wednesday 11:30 AM"));
		wb4.setOnAction(e->ltime.setText("Selected : Wednesday 1:00 PM"));
		wb5.setOnAction(e->ltime.setText("Selected : Wednesday 1:45 PM"));
		th1.setOnAction(e->ltime.setText("Selected : Thursday 10:00 AM"));
		th2.setOnAction(e->ltime.setText("Selected : Thursday 10:45 AM"));
		th3.setOnAction(e->ltime.setText("Selected : Thursday 11:30 AM"));
		th4.setOnAction(e->ltime.setText("Selected : Thursday 1:00 PM"));
		th5.setOnAction(e->ltime.setText("Selected : Thursday 1:45 PM"));
		fb1.setOnAction(e->ltime.setText("Selected : Friday 10:00 AM"));
		fb2.setOnAction(e->ltime.setText("Selected : Friday 10:45 AM"));
		fb3.setOnAction(e->ltime.setText("Selected : Friday 11:30 AM"));
		fb4.setOnAction(e->ltime.setText("Selected : Friday 1:00 PM"));
		fb5.setOnAction(e->ltime.setText("Selected : Friday 1:45 PM"));
		
		conn = MysqlConnect.ConnecrDb();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = MysqlConnect.ConnecrDb();
			
			System.out.println("Connection form Java FX success!");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("Select*from Staff");
			while(rs.next()) {
				String name = rs.getString("name");
				ObservableList <String> list = FXCollections.observableArrayList(name);
				listview.getItems().addAll(list);
			//	listview.setVisible(true);
				//pp.setText(name);
				System.out.println(name);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		 listview.setOnMouseClicked(new EventHandler<MouseEvent>() {

	        @Override
	        public void handle(MouseEvent event) {
	        	ltime.setVisible(true);
	   		 	lprof.setVisible(true);
	        	 listview.setOnMouseClicked(e->lprof.setText("Selected :  Coordinator " + listview.getSelectionModel().getSelectedItem()));
	        //	fb5.setOnAction(e->ltime.setText("Friday 1:45 PM selected"));
	            System.out.println("clicked on " + listview.getSelectionModel().getSelectedItem());
	            
	        }
	    });
	}
}
