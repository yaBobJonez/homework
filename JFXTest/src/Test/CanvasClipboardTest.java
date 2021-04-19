package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CanvasClipboardTest extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane pane = new AnchorPane();
        pane.setPrefSize(640, 480);
		Canvas canvas = new Canvas();
		canvas.relocate(0, 40);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		canvas.setOnMousePressed(e -> {
			gc.beginPath();
			gc.lineTo(e.getX(), e.getY());
			gc.stroke();
		});
		canvas.setOnMouseDragged(e -> {
			gc.lineTo(e.getX(), e.getY());
			gc.stroke();
		});
		canvas.setOnMouseDragReleased(e -> {
			gc.closePath();
		});
		AnchorPane.setBottomAnchor(canvas, 0.0);
		AnchorPane.setLeftAnchor(canvas, 0.0);
		AnchorPane.setRightAnchor(canvas, 0.0);
		canvas.widthProperty().bind(pane.widthProperty());
		canvas.heightProperty().bind(pane.heightProperty().subtract(35));
		MenuItem copy = new MenuItem("Copy");
		copy.setOnAction(e -> {
			WritableImage img = new WritableImage(640, 440);
			canvas.snapshot(new SnapshotParameters(), img);
			ClipboardContent clip = new ClipboardContent();
			clip.putImage(img);
			Clipboard.getSystemClipboard().setContent(clip);
		});
        Menu fileM = new Menu("File", null, copy);
        ColorPicker cp = new ColorPicker(Color.BLACK);
        cp.setOnAction(e -> {
        	gc.setStroke(cp.getValue());
        });
        MenuItem itemCp = new MenuItem("Color", cp);
        TextField width = new TextField();
        width.textProperty().addListener((obs, old, text) -> {
        	try{ gc.setLineWidth( Integer.parseInt(width.getText()) ); }
        	catch (Exception exc){ width.setText("1"); gc.setLineWidth(1); }
        });
        MenuItem itemW = new MenuItem("Width", width);
        Menu editM = new Menu("Edit", null, itemCp, itemW);
        MenuBar topBar = new MenuBar(fileM, editM);
		pane.getChildren().addAll(topBar, canvas);
		Scene scene = new Scene(pane, 640, 480);
		//scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
		stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
