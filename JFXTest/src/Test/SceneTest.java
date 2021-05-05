package Test;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SceneTest extends Application {
	Cursor[] states = {
		Cursor.DEFAULT,
		Cursor.CLOSED_HAND,
		Cursor.CROSSHAIR,
		Cursor.DISAPPEAR,
		Cursor.E_RESIZE,
		Cursor.H_RESIZE,
		Cursor.HAND,
		Cursor.MOVE,
		Cursor.N_RESIZE,
		Cursor.NE_RESIZE,
		Cursor.NONE,
		Cursor.NW_RESIZE,
		Cursor.OPEN_HAND,
		Cursor.S_RESIZE,
		Cursor.SE_RESIZE,
		Cursor.SW_RESIZE,
		Cursor.TEXT,
		Cursor.V_RESIZE,
		Cursor.W_RESIZE,
		Cursor.WAIT
	};
	int count = 0;
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
		Scene scene = new Scene(pane, 640, 480);
		scene.setFill(Color.BEIGE);
		scene.setCamera(new PerspectiveCamera());
		Alert alert = new Alert(AlertType.CONFIRMATION, "AAAAAAAAA", ButtonType.CLOSE, ButtonType.CANCEL, ButtonType.NO);
		Image img = new Image("https://www.iizcat.com/uploads/2016/10/5765y-jb3.jpg");
		ImageView iv = new ImageView(img);
		iv.setFitWidth(250);
		iv.setPreserveRatio(true);
		iv.setSmooth(true);
		iv.setLayoutX(10);
		iv.setLayoutY(10);
		scene.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
			if(e.getCode() == KeyCode.G){
				scene.setCursor(states[count]);
				count++;
				if(count == 20) count = 0;
			} else if(e.getCode() == KeyCode.W){
				alert.showAndWait().ifPresent(result -> {
					if(result == ButtonType.CANCEL) System.out.println("a.");
				});;
			}
		});
		WritableImage wimg = new WritableImage(100, 100);
		wimg.getPixelWriter().setPixels(15, 15, 35, 35, img.getPixelReader(), 40, 40);
		wimg.getPixelWriter().setPixels(50, 15, 35, 35, img.getPixelReader(), 120, 120);
		wimg.getPixelWriter().setColor(85, 15, Color.web("#00FFFF"));
		ImageView wiv = new ImageView(wimg);
		wiv.relocate(272, 12);
		pane.getChildren().addAll(iv, wiv);
		scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
		stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
