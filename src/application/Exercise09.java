package application;

import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Exercise09 extends Application{
	public static void main(String[] args) {
		
		Application.launch(args);
		
		
		
	}

	@Override
	public void start(Stage arg0) throws Exception {
	Text name=new Text("Name");
	Text street=new Text("Street");
	Text city=new Text("City");
	Text state=new Text("State");
	Text zip=new Text("Zip");
	TextField field1=new TextField();
	field1.setMaxWidth(350);
	TextField field2=new TextField();
	field2.setMaxWidth(350);
	TextField field3=new TextField();
	field3.setMaxWidth(90);
	TextField field4=new TextField();
	field4.setMaxWidth(35);
	TextField field5=new TextField();
	field5.setMaxWidth(55);
	
	VBox vBox1=new VBox();
	vBox1.setSpacing(10);
	HBox hBox1=new HBox();
	HBox hBox2=new HBox();
	HBox hBox3=new HBox();
	HBox hBox4=new HBox();
	
	Button add=new Button("Add");
	Button first=new Button("First");
	Button next=new Button("Next");
	Button previous=new Button("Previous");
	Button last=new Button("Last");
	Button update=new Button("Update");
	
	hBox1.getChildren().add(name);
	hBox1.getChildren().add(field1);
	hBox2.getChildren().add(street);
	hBox2.getChildren().add(field2);
	hBox3.getChildren().add(city);
	hBox3.getChildren().add(field3);
	hBox3.getChildren().add(state);
	hBox3.getChildren().add(field4);
	hBox3.getChildren().add(zip);
	hBox3.getChildren().add(field5);
	hBox4.getChildren().addAll(add,first,next,previous,last,update);
	vBox1.getChildren().addAll(hBox1,hBox2,hBox3,hBox4);
	
	

	
	//Scene
	Scene scene=new Scene(vBox1);
	arg0.setScene(scene);
	arg0.show();
	
	}

}
