package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AnonymousHandler extends Application{
int y=40;
int x=40;
	public static void main(String[] args) {
	Application.launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		Text text=new Text(x,y,"Java is fun");
		Pane pane=new Pane(text);
		
		HBox hbox=new HBox();
		Button left=new Button("Left");
		Button right=new Button("Right");
		Button up=new Button("Up");
		Button down=new Button("Down");
		hbox.getChildren().addAll(left,right,up,down);
		hbox.setAlignment(Pos.CENTER);
		hbox.setSpacing(10);
		BorderPane borderPane=new BorderPane(pane);
		borderPane.setBottom(hbox);
		//create and register the handler
		left.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
		text.setX(text.getX()>10?(text.getX()-5):10);
			}
			
		});
		right.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				text.setX(text.getX()<(pane.getWidth()-100)?text.getX()+5:(pane.getWidth()-100));
				
			}

		});
		up.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			text.setY(text.getY()>10?(text.getY()-5):10);
				
			}
			
		});
		down.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
			text.setY(text.getY()<pane.getHeight()?
					(text.getY()+5):pane.getHeight());
				
			}
			
		});
		
		//Scene time
		Scene scene =new Scene(borderPane,300,300);
		arg0.setTitle("Buttons lots of buttons");
		arg0.setScene(scene);
		arg0.show();
		
		
	}

}
