package Aquarium;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
	@FXML private Spinner<Double> length, width, depth;
	@FXML private Spinner<Integer> fish;
	@FXML private TextField volume;
	@FXML private Label result;
	@FXML protected void onCalculate(){
		if(length.getValue()!=null && width.getValue()!=null && depth.getValue()!=null){
			double vol = Math.round(length.getValue() * width.getValue() * depth.getValue() * 1000.0)/1000.0;
			volume.setText( String.valueOf(vol) );
			result.setText((vol>=Double.valueOf(fish.getValue()*9))?"Аквариум подходит.":"Аквариум НЕ подходит.");
			result.setTextFill((vol>=Double.valueOf(fish.getValue()*9))? Color.valueOf("#00B52D"):Color.valueOf("#D90000"));
		} else System.err.println("Значение пустое.");
	}
}
