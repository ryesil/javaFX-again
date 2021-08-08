package application;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class PathT extends Application{

	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
	Pane pane=new Pane();
	
	Rectangle rectangle=new Rectangle(100,100,25,50);
	rectangle.setFill(Color.ORANGE);
	
	Circle circle=new Circle(125,100,50);
	circle.setFill(Color.WHITE);
	circle.setStroke(Color.BLACK);
	pane.getChildren().add(circle);
	pane.getChildren().add(rectangle);
	
	//create a path transition;
	PathTransition pt=new PathTransition();
	pt.setDuration(Duration.millis(1000));
	pt.setPath(rectangle);
	pt.setNode(circle);
	pt.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
	pt.setCycleCount(Timeline.INDEFINITE);
	pt.setAutoReverse(true);
	pt.play();//start animation
	circle.setOnMousePressed(e->pt.pause());
	circle.setOnMouseReleased(e->pt.play());
	
	Scene scene=new Scene(pane);
	arg0.setScene(scene);
	arg0.show();
	
	
		
	}

	

}
