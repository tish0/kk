package secondPage;
import application.*;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;
import com.jfoenix.validation.base.ValidatorBase;

import application.BookScreen;
import bookConfirm.BookConfirmController;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodRequests;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import screenFramework.ScreenController;
import application.BookScreen;

public class BookSecondPageController  implements Initializable, screenFramework.ControlledScreen {

	BookScreen BS = new BookScreen();

	ScreenController myController;
	@FXML
	private Button back;
	@FXML
	private Button bookNow;
	@FXML
	private MenuButton pp;
	@FXML
	private TextField reason;
	@FXML
	public JFXTextField subject;
	@FXML
	private JFXTextField Sname;
	@FXML
	private JFXTextField Snum;
	@FXML
	private JFXTextField Smail;
	@FXML
	private JFXButton hide;
	@FXML
	private Label lplease;
	@FXML
	private Label reqFil;
	
	
	@FXML
	private Label Lsubject;
	@FXML
	private Label Lname;
	@FXML
	private Label Lnumber;
	@FXML
	private Label Lmail;
	@FXML
	private Label Lreason;
	@FXML
	private Label l1;
	@FXML
	private Label l2;
	@FXML
	private Label l3;
	@FXML
	private Label l4;
	@FXML
	private Label l5;
	@FXML
	private Label l6;
	@FXML
	private Label l7;
	@FXML
	private Label Lcoordinator;
	@FXML
	private Label Ldate;
	@FXML
	private Button ok;
	@FXML
	private Button Lback;
	
	@FXML
	private MenuItem r1;
	@FXML
	private MenuItem r2;
	@FXML
	private MenuItem r3;
	@FXML
	private MenuItem r4;
	@FXML
	private MenuItem r5;
	

	
	@FXML
	public void openBookScreen(ActionEvent event) throws Exception {               

		myController.setScreen(screenFramework.ScreensFramework.screen2ID);
		 hide.setVisible(false);
	}
	@FXML
	public void getItem(){
		
//		r1.setOnAction(e->Lreason.setText("Reason Number one selected"));
//		r2.setOnAction(e->Lreason.setText("Reason Number two selected"));
//		r3.setOnAction(e->Lreason.setText("Reason Number three selected"));
//		r4.setOnAction(e->Lreason.setText("Reason Number four selected"));
//		r5.setOnAction(e->Lreason.setText("Reason Number five selected"));
		
	}
	
	@FXML
	public void openConfirm(ActionEvent event) throws Exception {      
		 getItem();
		Lsubject.setText(  subject.getText());
		Lname.setText(  Sname.getText());
		Lnumber.setText(  Snum.getText());
		Lmail.setText(  Smail.getText());
		//Lreason.setText(  pp.getText());
		
		hide.setVisible(false);
		
		

		 l1.setVisible(true);
		 l2.setVisible(true);
		 l3.setVisible(true);
		 l4.setVisible(true);
		 l5.setVisible(true);
		 l6.setVisible(true);
		 l7.setVisible(true);


	

		Lsubject.setVisible(true);
		Lname.setVisible(true);
		Lnumber.setVisible(true);
		Lmail.setVisible(true);
		Lreason.setVisible(true);

		subject.setVisible(false);
		Sname.setVisible(false);
		Snum.setVisible(false);
		Smail.setVisible(false);
		pp.setVisible(false);
		lplease.setVisible(false);
		reqFil.setVisible(false);

		back.setVisible(false);
		bookNow.setVisible(false);
		Lback.setVisible(true);

		ok.setVisible(true);
	}

	@FXML
	public void goLback(ActionEvent event) throws Exception {     
		
		 l1.setVisible(false);
		 l2.setVisible(false);
		 l3.setVisible(false);
		 l4.setVisible(false);
		 l5.setVisible(false);
		 l6.setVisible(false);
		 l7.setVisible(false);
		 hide.setVisible(false);
		 
		Lsubject.setVisible(false);
		Lname.setVisible(false);
		Lnumber.setVisible(false);
		Lmail.setVisible(false);
		Lreason.setVisible(false);

		subject.setVisible(true);
		Sname.setVisible(true);
		Snum.setVisible(true);
		Smail.setVisible(true);
		pp.setVisible(true);
		lplease.setVisible(true);
		reqFil.setVisible(true);
		Lback.setVisible(false);
		ok.setVisible(false);

		back.setVisible(true);
		bookNow.setVisible(true);
	}

	@FXML
	public void goo(ActionEvent event) throws Exception{

		myController.setScreen(screenFramework.ScreensFramework.screen6ID);

		back.setVisible(true);
		bookNow.setVisible(true);
		ok.setVisible(false);

		subject.setVisible(true);
		Sname.setVisible(true);
		Snum.setVisible(true);
		Smail.setVisible(true);
		pp.setVisible(true);
		lplease.setVisible(true);
		reqFil.setVisible(true);
		
		Lsubject.setVisible(false);
		Lname.setVisible(false);
		Lnumber.setVisible(false);
		Lmail.setVisible(false);
		Lreason.setVisible(false);

		subject.setText("");
		Sname.setText("");
		Snum.setText("");
		Smail.setText("");
		//pp.setText("Reason for meeting");


		Lsubject.setText(  subject.getText());
		Lname.setText(  Sname.getText());
		Lnumber.setText(  Snum.getText());
		Lmail.setText(  Smail.getText());
		Lreason.setText(  pp.getText());
		Lback.setVisible(false);
		 l1.setVisible(false);
		 l2.setVisible(false);
		 l3.setVisible(false);
		 l4.setVisible(false);
		 l5.setVisible(false);
		 l6.setVisible(false);
		 l7.setVisible(false);
		 //l2.setText(BS.

	}

	@FXML
	public void getReason(ActionEvent event) throws Exception {               
		reason.setText("Reason one");
	}

	public void setScreenParent(ScreenController screenParent) {
		myController = screenParent;

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//l2.setText(BS.ltime);
		
		//for field student number - number keyboard will popup
		//for field email  - email style keyboard will popup
		 Snum.getProperties().put("vkType", "numeric");
		 Smail.getProperties().put("vkType", "email");
		 
		r1.setOnAction(e->Lreason.setText("Academic Advising"));
		r2.setOnAction(e->Lreason.setText("Personal"));
		r3.setOnAction(e->Lreason.setText("Timetable"));
		r4.setOnAction(e->Lreason.setText("Mentoring"));
		r5.setOnAction(e->Lreason.setText("Other"));

		RequiredFieldValidator valid = new RequiredFieldValidator();
		NumberValidator numVal = new NumberValidator();

		Snum.getValidators().add(numVal);
		numVal.setMessage("Only numbers are allowed");

		subject.getValidators().add(valid);

		valid.setMessage("No input given");


		Sname.getValidators().add(valid);
		valid.setMessage("No input given");

		Smail.getValidators().add(valid);
		valid.setMessage("No input given");


		subject.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(!newValue)
				{
					subject.validate();
					hide.setVisible(true);
				}
			}
		});


		Snum.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(!newValue)
				{
					Snum.validate();
					hide.setVisible(true);
				}
			}
		});


		Sname.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(!newValue)
				{
					Sname.validate();
					hide.setVisible(true);
				}
			}
		});

		Smail.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(!newValue)
				{
					Smail.validate();
					hide.setVisible(true);
				}
			}
		});
		
		Smail.setOnMouseClicked(new EventHandler<Event>() {
		    public void handle(MouseEvent me) {
		    	hide.setVisible(true);
		    }

			@Override
			public void handle(Event event) {
				hide.setVisible(true);
				
			}
		});
		Sname.setOnMouseClicked(new EventHandler<Event>() {
		    public void handle(MouseEvent me) {
		    	hide.setVisible(true);
		    }

			@Override
			public void handle(Event event) {
				hide.setVisible(true);
				
			}
		});
		Snum.setOnMouseClicked(new EventHandler<Event>() {
		    public void handle(MouseEvent me) {
		    	hide.setVisible(true);
		    }

			@Override
			public void handle(Event event) {
				hide.setVisible(true);
				
			}
		});
		subject.setOnMouseClicked(new EventHandler<Event>() {
		    public void handle(MouseEvent me) {
		    	hide.setVisible(true);
		    }

			@Override
			public void handle(Event event) {
				hide.setVisible(true);
				
			}
		});
		
		hide.setOnMouseClicked(new EventHandler<Event>() {
		    public void handle(MouseEvent me) {
		    	hide.setVisible(false);
		    }

			@Override
			public void handle(Event event) {
				hide.setVisible(false);
				
			}
		});
		
	}
	
}
