import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class MediaTestWin extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        pane.setPrefSize(640, 480);
        Media video = new Media("https://file-examples-com.github.io/uploads/2017/04/file_example_MP4_1280_10MG.mp4");
        MediaPlayer controls = new MediaPlayer(video);
        MediaView player = new MediaView(controls);
        player.setFitWidth(640);
        player.setFitHeight(480);
        controls.setOnReady(() -> {
            controls.play();
        });
        pane.getChildren().add(player);
        Scene scene = new Scene(pane, 640, 480);
        stage.setTitle("ROSTIK LALKA");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
