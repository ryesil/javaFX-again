package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEvent extends Application {
public static void main(String[] args) {
	Application.launch(args);
	
	
}

@Override
public void start(Stage arg0) throws Exception {
Pane pane=new Pane();
Scene scene=new Scene(pane,400,400);
Text text=new Text(scene.getHeight()/2,scene.getWidth()/2,"Programming is fun!");
pane.getChildren().add(text);
text.setOnMouseDragged(e->{
	text.setX(e.getX());
	text.setY(e.getY());
	System.out.println(e.getX());
	System.out.println(e.getY());
});
//scene

arg0.setTitle("Mouse Event");
arg0.setScene(scene);
arg0.show();

	
}
}
