package application;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class MainController {
	@FXML private DatePicker db;
	@FXML private Label showDatelbl;
	
	
	public void ShowDate(ActionEvent event) {
		LocalDate ld = db.getValue();
		showDatelbl.setText(ld.toString());
	}
	
}
