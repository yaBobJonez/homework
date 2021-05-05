package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebTest extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		VBox pane = new VBox();
        pane.setPrefSize(640, 480);
        	HBox buttons = new HBox();
        		Button back = new Button("<");
        		Button reload = new Button("@");
        		Button forward = new Button(">");
        		TextField link = new TextField();
        			HBox.setHgrow(link, Priority.ALWAYS);
        		Button search = new Button("-o");
        	buttons.getChildren().addAll(back, reload, forward, link, search);
        	WebView browser = new WebView();
        	WebEngine web = browser.getEngine();
        		web.locationProperty().addListener(e -> {
        			link.setText(web.getLocation());
        		});
        	back.setOnAction(e -> {
        		web.executeScript("history.back()");
        	});
        	reload.setOnAction(e -> {
        		web.reload();
        	});
        	forward.setOnAction(e -> {
        		web.executeScript("history.forward()");
        	});
        	search.setOnAction(e -> {
        		web.load(link.getText());
        	});
        web.load("https://google.com/");
        pane.getChildren().addAll(buttons, browser);
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
