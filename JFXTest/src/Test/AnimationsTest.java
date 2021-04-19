package Test;

import javafx.animation.FadeTransition;
import javafx.animation.FillTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class AnimationsTest extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
        Rectangle sq = new Rectangle(50, 50, 100, 100);
        RotateTransition rotation = new RotateTransition(Duration.seconds(5));
        rotation.setByAngle(45);
        rotation.setCycleCount(Timeline.INDEFINITE);
        rotation.setFromAngle(45);
        rotation.setAutoReverse(true);
        rotation.setNode(sq);
        rotation.play();
        FillTransition fill = new FillTransition(Duration.seconds(5), sq);
        fill.setToValue(Color.SANDYBROWN);
        fill.play();
        Rectangle sq2 = new Rectangle(150, 150, 75, 75);
        TranslateTransition movement = new TranslateTransition(Duration.seconds(3), sq2);
        movement.setByX(100);
        movement.setAutoReverse(true);
        movement.setCycleCount(8);
        FadeTransition fade = new FadeTransition(Duration.seconds(5), sq2);
        fade.setToValue(0.2);
        fade.setAutoReverse(true); fade.setCycleCount(2);
        fade.setDelay(Duration.seconds(1));
        SequentialTransition seq = new SequentialTransition(fade, movement);
        seq.play();
        Rectangle sq3 = new Rectangle(75, 250, 50, 50);
        ScaleTransition scale = new ScaleTransition(Duration.seconds(2), sq3);
        scale.setByX(0.3);
        scale.setByY(0.3);
        scale.setAutoReverse(true);
        scale.setCycleCount(30);
        scale.play();
        Path p = new Path(
        	new MoveTo(sq3.getX() + sq3.getWidth()/2, sq3.getY() + sq3.getHeight()/2),
        	new LineTo(125, 250),
        	new LineTo(125, 310),
        	new LineTo(75, 310)
        ); PathTransition path = new PathTransition(Duration.seconds(10), p, sq3);
        path.setAutoReverse(true);
        path.setCycleCount(3);
        path.setDelay(Duration.seconds(1));
        path.play();
        pane.getChildren().addAll(sq, sq2, sq3);
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
