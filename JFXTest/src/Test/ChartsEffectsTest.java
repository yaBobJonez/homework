package Test;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.effect.Glow;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ChartsEffectsTest extends Application {
	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage stage) throws Exception {
		Pane pane = new Pane();
        pane.setPrefSize(640, 480);
        PieChart pie = new PieChart(FXCollections.observableArrayList(
    		new PieChart.Data("A", 62),
    		new PieChart.Data("B", 32),
    		new PieChart.Data("C", 6)
        )); pie.setPrefSize(260, 200);
        pie.setTitle("Pie, mmm");
        pie.setTitleSide(Side.TOP);
        pie.setLabelLineLength(10);
        pie.setLabelsVisible(false);
        pie.setLegendVisible(true);
        pie.setLegendSide(Side.RIGHT);
        LineChart<Number, Number> line = new LineChart<Number, Number>(new NumberAxis("X", 0, 1000, 100), new NumberAxis("Y", 0, 100, 10));
        line.setPrefSize(300, 270);
        line.relocate(0, 200);
        line.setTitle("Lines, E.");
        @SuppressWarnings({ "rawtypes" })
		XYChart.Series lineSeries = new XYChart.Series("D", FXCollections.observableArrayList(
        	new XYChart.Data(10, 20),
        	new XYChart.Data(64, 78),
        	new XYChart.Data(467, 4),
        	new XYChart.Data(800, 63),
        	new XYChart.Data(812, 48),
        	new XYChart.Data(935, 52)
        )); line.getData().add(lineSeries);
        line.setLegendVisible(true);
        line.setCreateSymbols(false);
        line.setVerticalGridLinesVisible(false);
        line.setHorizontalZeroLineVisible(false);
        line.getXAxis().setTickLabelsVisible(false);
        line.getYAxis().setTickMarkVisible(false);
        line.getXAxis().setLabel("");
        AreaChart<String, Number> area = new AreaChart<>(new CategoryAxis(), new NumberAxis(0, 10, 2));
        area.setPrefSize(300, 200);
        area.relocate(300, 0);
        area.setTitle("Copy?");
        @SuppressWarnings("rawtypes")
		XYChart.Series lineSeries2 = new XYChart.Series("E", FXCollections.observableArrayList(
        	new XYChart.Data("a", 2),
        	new XYChart.Data("b", 4),
        	new XYChart.Data("c", 5),
        	new XYChart.Data("d", 1),
        	new XYChart.Data("e", 3),
        	new XYChart.Data("f", 8)
        )); area.getData().add(lineSeries2);
        lineSeries2.getNode().lookup(".chart-series-area-line").setStyle("-fx-stroke: aqua;");
        lineSeries2.getNode().lookup(".chart-series-area-fill").setStyle("-fx-fill: blue;");
        BarChart<String, Number> bars = new BarChart<>(new CategoryAxis(FXCollections.observableArrayList(
        	"Speed", "Acceleration", "Braking"
        )), new NumberAxis(0, 5, 1));
        bars.setPrefSize(300, 250);
        bars.relocate(300, 200);
        bars.setTitle("Carz :P");
        @SuppressWarnings("rawtypes")
		XYChart.Series bar1 = new XYChart.Series("Chevy", FXCollections.observableArrayList(
            	new XYChart.Data("Speed", 3),
            	new XYChart.Data("Acceleration", 4),
            	new XYChart.Data("Braking", 5)
        )); @SuppressWarnings("rawtypes")
		XYChart.Series bar2 = new XYChart.Series("Ford", FXCollections.observableArrayList(
            	new XYChart.Data("Speed", 3),
            	new XYChart.Data("Acceleration", 1),
            	new XYChart.Data("Braking", 4)
        ));
        bars.getData().addAll(bar1, bar2);
        line.setEffect(new Glow(0.7));
        bars.setEffect(new GaussianBlur());
        pane.getChildren().addAll(pie, line, area, bars);
        Scene scene = new Scene(pane, 640, 480);
        scene.setOnMouseClicked(e -> System.out.println(e.getSceneX() + ":" + e.getSceneY()));
        stage.setTitle("OoOh, dey-tuh!");
        stage.setScene(scene);
        stage.show();
	}
	public static void main(String[] args) {
		launch();
	}
}
