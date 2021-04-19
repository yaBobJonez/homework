package Test;

import java.io.File;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class StagesTest extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
		Scene scene = new Scene(pane, 640, 480);
		//scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("javafx.stage.* E");
        stage.setResizable(true);
        stage.setOpacity(0.7);
        stage.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
        	if(e.getCode() == KeyCode.SPACE) stage.setMaximized(!stage.isMaximized());
        	else if(e.getCode() == KeyCode.E){ if(stage.isFullScreen()) stage.setFullScreen(false); else stage.setFullScreen(true); }
        	else if(e.getCode() == KeyCode.SHIFT) stage.centerOnScreen();
        	else if(e.getCode() == KeyCode.ALT){ if(stage.getModality() == Modality.NONE) stage.initModality(Modality.APPLICATION_MODAL);
        		else stage.initModality(Modality.NONE); }
        	else if(e.getCode() == KeyCode.H){
        		Stage f = new Stage(StageStyle.UTILITY);
        		f.show();
        	} else if(e.getCode() == KeyCode.SLASH){
        		Screen sc = Screen.getPrimary();
        		System.out.println(sc.getBounds());
        		System.out.println(sc.getDpi());
        		System.out.println(sc.getVisualBounds());
        	} else if(e.getCode() == KeyCode.D){
        		FileChooser fc = new FileChooser();
        		fc.setTitle("Ok, close it.");
        		File f = fc.showOpenDialog(stage);
        		if(f != null) System.out.println(f.getPath());
        	} else if(e.getCode() == KeyCode.P){
        		Popup p = new Popup();
        		p.centerOnScreen();
        		p.getContent().add(new Button("A"));
        		p.show(stage);
        	}
        });
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("E"));
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
