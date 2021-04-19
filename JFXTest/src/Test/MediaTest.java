package Test;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MediaTest extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
        Media video = new Media(new File("VideoExample.mp4").toURI().toString());
        MediaPlayer controls = new MediaPlayer(video);
        MediaView player = new MediaView(controls);
        player.setFitWidth(640);
        player.setFitHeight(480);
        player.setPreserveRatio(false);
        controls.setOnReady(() -> controls.play());
        pane.getChildren().add(player);
        Scene scene = new Scene(pane, 640, 480);
        scene.setOnKeyPressed(e -> {
        	Duration time = controls.getCurrentTime();
        	switch(e.getCode()){
        		case LEFT:
        			if(time.greaterThan( Duration.seconds(5) )) controls.seek(time.subtract(Duration.seconds(5)));
        			break;
        		case RIGHT:
        			if(time.lessThan( controls.getTotalDuration().subtract(Duration.seconds(5)) ))
        				controls.seek(time.add(Duration.seconds(5)));
        			break;
        		case DOWN:
        			if(controls.getStatus() == Status.PLAYING) controls.pause();
        			else controls.play();
        			break;
        		default:
        			break;
        	}
        });
        //scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("OoOh, dey-tuh!");
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
