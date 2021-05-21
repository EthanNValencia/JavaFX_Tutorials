package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class MainController implements Initializable {

	@FXML private WebView webView;
	@FXML private WebEngine webEngine;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		webEngine = webView.getEngine();
	}
	public void btn1(ActionEvent event) {
		webEngine.load("dreamfactorytexas.ga");
	}
	public void btn2(ActionEvent event) {
		//webEngine.executeScript("window.location = \"google.com\";");
	}
	public void btn3(ActionEvent event) {
		webEngine.load("<html><body><h1>Hello World</h1></body></html>");
	}
	public void btn4(ActionEvent event) {
		webEngine.reload();;
	}
}
