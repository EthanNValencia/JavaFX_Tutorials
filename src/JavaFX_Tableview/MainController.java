package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController implements Initializable {

	@FXML private TableView<Student> table;
	@FXML private TableColumn<Student, Integer> id;
	@FXML private TableColumn<Student, String> name;
	@FXML private TableColumn<Student, String> surname;
	@FXML private TableColumn<Student, Integer> age;
	
	public ObservableList<Student> obList = FXCollections.observableArrayList(
			new Student(101, "Tim", "Clone1", 18), 
			new Student(102, "Kim", "Clone2", 2), 
			new Student(103, "Yim", "Clone3", 26), 
			new Student(104, "Rim", "Clone4", 10), 
			new Student(105, "Wim", "Clone5", 12), 
			new Student(106, "Bim", "Clone6", 13), 
			new Student(107, "Nim", "Clone7", 17),
			new Student(108, "Nim", "Clone7", 17)
			);
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		id.setCellValueFactory(new PropertyValueFactory<Student, Integer>("id"));
		name.setCellValueFactory(new PropertyValueFactory<Student, String>("name"));
		surname.setCellValueFactory(new PropertyValueFactory<Student, String>("surname"));
		age.setCellValueFactory(new PropertyValueFactory<Student, Integer>("age"));
		table.setItems(obList);
		
	}
	
}
