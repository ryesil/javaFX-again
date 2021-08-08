package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ControlCircle extends Application {
private	int radius=50;
private Color color2=new Color(Math.random(),Math.random(),Math.random(),Math.random());
private Color color=new Color(Math.random(),Math.random(),Math.random(),Math.random());
public static void main(String[] args) {
	
Application.launch(args);
}

@Override
public void start(Stage arg0) throws Exception {
StackPane pane=new StackPane();
Circle circle=new Circle(radius);
circle.setStroke(Color.BLACK);
circle.setFill(Color.BEIGE);
pane.getChildren().add(circle);

HBox hbox=new HBox(10);
hbox.setPadding(new Insets(10));
Button enlarge=new Button("Enlarge");
Button shrink=new Button("Shrink");

enlarge.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent arg0) {
	
	radius+=20;
	circle.setRadius(radius);
	circle.setFill(color);
	
	circle.setStroke(color2);
	}
	
});
shrink.setOnAction(new EventHandler<ActionEvent>() {

	@Override
	public void handle(ActionEvent arg0) {
		radius-=20;
		circle.setRadius(radius);
		circle.setFill(color);
		circle.setStroke(color2);
	}
	
});
hbox.getChildren().add(shrink);
hbox.getChildren().add(enlarge);
hbox.setAlignment(Pos.CENTER);
BorderPane borderPane=new BorderPane();
borderPane.setCenter(pane);
borderPane.setBottom(hbox);


Scene scene=new Scene(borderPane,300,300);
arg0.setScene(scene);
arg0.show();
	
	
}
}
