package Test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class GeometryTest extends Application {
	@Override
	public void start(Stage stage){
		Pane pane = new Pane();
        pane.setPrefSize(230, 405);
        Line l1 = new Line(15, 10, 200, 15);
        l1.setStrokeWidth(5);
        l1.setStroke(Color.BLUE);
        l1.setStrokeLineCap(StrokeLineCap.ROUND);
        Rectangle rect1 = new Rectangle(40, 35, 110, 70);
        rect1.setRotate(10);
        rect1.setFill(Color.ORANGERED);
        rect1.setStroke(Color.LIGHTGRAY);
        rect1.setStrokeLineCap(StrokeLineCap.ROUND);
        rect1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        rect1.setStrokeType(StrokeType.INSIDE);
        rect1.setStrokeWidth(5);
        rect1.setArcWidth(5);
        rect1.setArcHeight(5);
        Circle c1 = new Circle(80, 120, 35);
        c1.setFill(Color.web("10fe43"));
        Ellipse el1 = new Ellipse(110, 162, 26, 18);
        el1.setFill(Color.AQUA);
        el1.setRotate(35);
        Polygon tr1 = new Polygon(85, 180, 15, 280, 155, 280);
        tr1.setStrokeLineJoin(StrokeLineJoin.ROUND);
        tr1.setStrokeWidth(8);
        tr1.setStroke(Color.RED);
        tr1.setFill(Color.ANTIQUEWHITE);
        Polyline star = new Polyline(
        	85, 220,
        	70, 260,
        	105, 235,
        	65, 235,
        	100, 260,
        	85, 220
        ); star.setFill(Color.GOLD);
        QuadCurve curve1 = new QuadCurve(20, 324, 34, 267, 104, 277);
        Arc arc1 = new Arc(80, 330, 40, 40, 16, 65);
        SVGPath svg = new SVGPath();
        svg.setContent("M 63 335 L 49 379 L 127 373 L 88 365 z");
        svg.setFill(Color.MAGENTA);
		pane.getChildren().addAll(l1, rect1, c1, el1, tr1, star, curve1, arc1, svg);
		Scene scene = new Scene(pane, 230, 405);
		scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("Testing shapes :D");
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
