package Test;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.robot.Robot;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class EventsTest extends Application {
	int colorSelected = 0;
	Color[] colors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.AQUA, Color.BLUE, Color.DARKVIOLET};
	Robot rb = new Robot();
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
        Circle c1 = new Circle(10, 10, 10, Color.BLUE);
        c1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent arg0) {
				c1.setFill(colors[colorSelected]);
				colorSelected += 1;
				if(colorSelected == 6) colorSelected = 0;
			}
        });
        stage.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
        	if(e.getCode() == KeyCode.F){
        		double x = rb.getMouseX() - stage.getX();
        		double y = rb.getMouseY() - stage.getY();
        		Rectangle rc = new Rectangle(x, y, 10, 10);
        		pane.getChildren().add(rc);
        	}
        });
        stage.setOnCloseRequest(e -> System.out.println("Naaaah, don't leave me :("));
        pane.getChildren().addAll(c1);
        Scene scene = new Scene(pane, 640, 480);
		//scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
		scene.setOnMouseDragged(e -> c1.relocate(e.getX(), e.getY()));
        stage.setTitle("event(); test!");
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
