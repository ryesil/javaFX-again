package application;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TimeLineEx extends Application{
	
public static void main(String[] args) {
Application.launch(args);	
	
	
	
}

@Override
public void start(Stage arg0) throws Exception {
	StackPane pane=new StackPane();
	
	Text text=new Text("Programming is fun!");
	text.setFill(Color.RED);
	pane.getChildren().add(text);
	
	EventHandler<ActionEvent> eventHandler=e->{
		if(text.getText().length()!=0) {
			text.setText("");
		} else {
			text.setText("Programing is fun");;
		}
	};
	
	Timeline animation=new Timeline(new KeyFrame(Duration.millis(500),
			eventHandler));
	animation.setCycleCount(Timeline.INDEFINITE);
	animation.play();
	

	Scene scene=new Scene(pane,250,250);
	arg0.setScene(scene);
	arg0.show();
	
}
}
