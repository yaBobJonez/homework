package Test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class LayoutTextTest extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		AnchorPane extpane = new AnchorPane();
        extpane.setPrefSize(640, 480);
        extpane.setOpaqueInsets(new Insets(10));
        Label txt = new Label("OH HELLO OVER THERE!");
        txt.setFont(Font.font("arial", FontWeight.BOLD, FontPosture.ITALIC, 22));
        txt.setTextAlignment(TextAlignment.CENTER);
        txt.setAlignment(Pos.CENTER);
        AnchorPane.setTopAnchor(txt, 5.0);
        AnchorPane.setLeftAnchor(txt, 10.0);
        AnchorPane.setRightAnchor(txt, 10.0);
        GridPane intpane = new GridPane();
        Button b1 = new Button("1");
        GridPane.setHgrow(b1, Priority.ALWAYS);
        GridPane.setVgrow(b1, Priority.ALWAYS);
        b1.setMaxWidth(Double.MAX_VALUE);
        b1.setMaxHeight(Double.MAX_VALUE);
        intpane.add(b1, 0, 0);
        Button b2 = new Button("2");
        HBox.setHgrow(b2, Priority.ALWAYS);
        VBox.setVgrow(b2, Priority.ALWAYS);
        intpane.add(b2, 1, 0);
        Button b3 = new Button("3");
        HBox.setHgrow(b3, Priority.ALWAYS);
        VBox.setVgrow(b3, Priority.ALWAYS);
        intpane.add(b3, 2, 0);
        Button b4 = new Button("4");
        HBox.setHgrow(b4, Priority.ALWAYS);
        VBox.setVgrow(b4, Priority.ALWAYS);
        intpane.add(b4, 0, 1);
        intpane.add(new Button("5"), 1, 1);
        intpane.add(new Button("6"), 2, 1);
        intpane.add(new Button("7"), 0, 2);
        intpane.add(new Button("8"), 1, 2);
        intpane.add(new Button("9"), 2, 2);
        AnchorPane.setTopAnchor(intpane, 40.0);
        AnchorPane.setLeftAnchor(intpane, 10.0);
        AnchorPane.setRightAnchor(intpane, 10.0);
        AnchorPane.setBottomAnchor(intpane, 10.0);
        intpane.setVgap(10);
        intpane.setHgap(10);
        for(int i = 0; i < 3; i++){
        	ColumnConstraints cc = new ColumnConstraints();
        	cc.setPercentWidth(30);
        	intpane.getColumnConstraints().add(cc);
        } for(int j = 0; j < 3; j++){
    		RowConstraints rc = new RowConstraints();
    		rc.setPercentHeight(30);
    		intpane.getRowConstraints().add(rc);
    	} intpane.setGridLinesVisible(true);
    	intpane.setAlignment(Pos.CENTER);
        extpane.getChildren().addAll(txt, intpane);
		Scene scene = new Scene(extpane, 640, 480);
		stage.setTitle("Lay thuh text.");
		stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
