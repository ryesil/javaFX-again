package application;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HandleEvent extends Application {

	public static void main(String[] args) {
	Application.launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		HBox pane=new HBox(10);
		pane.setAlignment(Pos.CENTER);
		Button ok=new Button("OK");
		Button cancel=new Button("Cancel");
		ok.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Ok Button clicked");
			}
			
		});
		cancel.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
			System.out.println("cancel button clicked");
			}
		});
		
		pane.getChildren().addAll(ok,cancel);
		//create a scene
		Scene Scene= new Scene(pane,200,100);
		arg0.setTitle("handle event");
		arg0.setScene(Scene);
		arg0.show();
	}
}
	
	


