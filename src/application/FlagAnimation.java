package application;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FlagAnimation extends Application {

	public static void main(String[] args) {
	Application.launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
	Image image=new Image("Capture.PNG");
	ImageView flag=new ImageView(image);
		
	
	
	Pane pane=new Pane();
			pane.getChildren().add(flag);
			
	PathTransition pt=new PathTransition(Duration.millis(10000),
	new Line(100,200,100,0),flag);
	pt.setCycleCount(5);
	pt.play();
		Scene scene=new Scene(pane,250,200);
		arg0.setScene(scene);
		arg0.show();
		
			
	}

}
