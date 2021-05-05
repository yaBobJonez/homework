package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TemplateOfTest extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
        
        pane.getChildren().addAll();
        Scene scene = new Scene(pane, 640, 480);
        //scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("OoOh, dey-tuh!");
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
