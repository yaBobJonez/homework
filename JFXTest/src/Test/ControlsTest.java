package Test;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlsTest extends Application{
	@Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        pane.setPrefSize(320, 480);
        Label l1 = new Label("Text?");
        l1.setLayoutX(10);
        l1.setLayoutY(10);
        l1.setMaxSize(40, 8);
        TextField t1 = new TextField("Test.");
        t1.setLayoutX(56);
        t1.setLayoutY(6);
        t1.setMaxSize(155, 8);
        Button b1 = new Button("Click me!");
        b1.setLayoutX(227);
        b1.setLayoutY(6);
        b1.setMaxSize(95, 8);
        ProgressBar prb1 = new ProgressBar();
        prb1.setLayoutX(10);
        prb1.setLayoutY(42);
        prb1.setPrefSize(297, 30);
        Timeline tl = new Timeline(new KeyFrame(Duration.millis(200), e -> {
        	prb1.setProgress(prb1.getProgress() + 0.02);
        }));
        b1.setOnAction(e -> {
        	t1.setText("Yes.");
        	prb1.setProgress(0);
        	tl.setCycleCount(50);
        	tl.play();
        });
        CheckBox ch1 = new CheckBox("Check");
        ch1.relocate(10, 248);
        ListView<String> ls1 = new ListView<>();
        ls1.relocate(10,  80);
        ls1.setPrefSize(297, 150);
        ls1.setItems(FXCollections.observableArrayList("Apple", "Banana", "Orange", "Tomato"));
        Slider sl1 = new Slider(0, 100, 12);
        sl1.setPrefWidth(230);
        sl1.relocate(82, 242);
        sl1.setShowTickMarks(true);
        sl1.setShowTickLabels(true);
        sl1.setMajorTickUnit(10);
        sl1.setBlockIncrement(10);
        ToggleGroup rdGr = new ToggleGroup();
        RadioButton rd1 = new RadioButton("Fox");
        RadioButton rd2 = new RadioButton("Cat");
        rd1.setToggleGroup(rdGr);
        rd2.setToggleGroup(rdGr);
        rd1.relocate(10, 290);
        rd2.relocate(76, 290);
        PasswordField pwf1 = new PasswordField();
        pwf1.relocate(140, 286);
        pwf1.setPrefSize(168, 8);
        ColorPicker cp1 = new ColorPicker();
        cp1.relocate(10, 328);
        cp1.setPrefSize(120, 30);
        pane.getChildren().addAll(l1, t1, b1, prb1, ch1, ls1, sl1, rd1, rd2, pwf1, cp1);
        Scene scene = new Scene(pane, 320, 480);
        scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("Testing everything :D");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
