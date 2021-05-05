package Lesson12_02;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	@FXML private TextField counter;
	@FXML protected void addAction(){
		counter.setText( String.valueOf( Integer.parseInt(counter.getText())+1 ) ); //Костыли String <-> int xD
	}
	@FXML protected void subtractAction(){
		counter.setText( String.valueOf( Integer.parseInt(counter.getText())-1 ) );
	}
}
