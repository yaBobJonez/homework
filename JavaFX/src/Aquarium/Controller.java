package Aquarium;

import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class Controller {
	@FXML private Spinner<Double> length, width, depth;
	@FXML private TextField volume;
	@FXML protected void onCalculate(){
		if(length.getValue()!=null && width.getValue()!=null && depth.getValue()!=null){
			volume.setText( String.valueOf(Math.round(length.getValue() * width.getValue() * depth.getValue() * 1000.0)/1000.0) );
		} else System.err.println("Значение пустое.");
	}
}
