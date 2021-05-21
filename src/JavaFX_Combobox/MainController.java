package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class MainController implements Initializable {

	
	@FXML
	public Label nameLabel;
	
	@FXML
	public ComboBox<String> comboBox1;
	ObservableList<String> list = FXCollections.observableArrayList("Tim","Kim","Slim","Lim");
	
	@FXML
	public ComboBox<String> comboBox2;
	//ObservableList<String> list2 = FXCollections.observableArrayList();
	
	@FXML
	public ListView<String> listView;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		comboBox1.setItems(list);
		listView.setItems(list);
		listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	public void comboChanged(ActionEvent event) {
		nameLabel.setText(comboBox1.getValue());
		comboBox1.getItems().addAll("Blah?");
		comboBox2.getItems().addAll("Changed?");
	}
	public void bottonAction(ActionEvent event) {
		//comboBox1.getItems().addAll("Button!");
		//comboBox2.getItems().addAll("Button?");
		//listView.getItems().addAll("the", "button", "clicked");
		ObservableList<String> names;
		names = listView.getSelectionModel().getSelectedItems();
		for(String name: names) {
			System.out.println(name);
		}
	}

}
