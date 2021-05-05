package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

public class Geom3DTest extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(200, 270);
        Box b1 = new Box(100, 150, 50);
        b1.relocate(30, 30);
        b1.getTransforms().addAll(new Rotate(20, Rotate.Y_AXIS), new Rotate(-20, Rotate.X_AXIS));
        b1.setMaterial(new PhongMaterial(Color.DEEPSKYBLUE));
        Cylinder cyl1 = new Cylinder(75, 20);
        cyl1.relocate(50, 120);
        cyl1.getTransforms().addAll(new Rotate(70, Rotate.Z_AXIS), new Rotate(30, Rotate.X_AXIS));
        cyl1.setMaterial(new PhongMaterial(Color.DARKRED));
        Sphere sph1 = new Sphere(50);
        sph1.relocate(26, 156);
        sph1.setMaterial(new PhongMaterial(Color.YELLOWGREEN));
        pane.getChildren().addAll(b1, cyl1, sph1);
        Scene scene = new Scene(pane, 200, 270);
		scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("3D shapes!");
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
