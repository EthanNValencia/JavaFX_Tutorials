package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainController implements Initializable {

	@FXML
	TreeView<String> treeView;
	
	Image icon = new Image(getClass().getResourceAsStream("/img/redpanda.png"));
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		TreeItem<String> root = new TreeItem<>("Root", new ImageView(icon)); // create the root (top of tree)
		
		TreeItem<String> nodeA = new TreeItem<>("Node A", new ImageView(icon)); // create nodes
		TreeItem<String> nodeB = new TreeItem<>("Node B", new ImageView(icon));
		TreeItem<String> nodeC = new TreeItem<>("Node C", new ImageView(icon));
		
		
		root.getChildren().add(nodeA); // add node to root
		root.getChildren().add(nodeB);
		root.getChildren().add(nodeC);
		
		TreeItem<String> nodeA1 = new TreeItem<>("Node A1", new ImageView(icon)); // create nodes
		TreeItem<String> nodeB1 = new TreeItem<>("Node B1", new ImageView(icon));
		TreeItem<String> nodeC1 = new TreeItem<>("Node C1", new ImageView(icon));
		nodeA.getChildren().addAll(nodeA1,nodeB1,nodeC1);
		nodeA.setExpanded(true);
		
		treeView.setRoot(root); // set this root to the treeView
	}
	
	public void mouseClick(MouseEvent mouseEvent) {
		if(mouseEvent.getClickCount() == 2) {
			TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
			System.out.println(item.getValue());
		}
		
	}
}
