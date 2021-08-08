package application;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeT extends Application{

	public static void main(String[] args) {
	
	Application.launch();

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		Pane pane=new Pane();
		Ellipse ellipse=new Ellipse(10,10,100,50);
		ellipse.setFill(Color.RED);
		ellipse.setStroke(Color.BLACK);
		ellipse.centerXProperty().bind(pane.widthProperty().divide(2));
		ellipse.centerYProperty().bind(pane.heightProperty().divide(2));
		ellipse.radiusXProperty().bind(pane.widthProperty().multiply(0.4));
		ellipse.radiusYProperty().bind(pane.heightProperty().multiply(0.4));
		pane.getChildren().add(ellipse);
		
		//Apply a fade transition
		FadeTransition ft=new FadeTransition(Duration.millis(3000),ellipse);
		ft.setFromValue(1);
		ft.setToValue(0.1);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		//scene
		Scene scene=new Scene(pane,200,200);
		arg0.setScene(scene);
		arg0.show();
		
		
	}

}
