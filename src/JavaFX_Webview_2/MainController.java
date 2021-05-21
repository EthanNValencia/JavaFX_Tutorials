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
	private WebEngine engine;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		engine = webView.getEngine();
		
	}
	public void btn1(ActionEvent event) {
		//engine.load("https://www.google.com");
	}
	public void btn2(ActionEvent event) {
		//engine.load("https://www.google.com");
		//engine.executeScript(""); // put javascript
	}
	public void btn3(ActionEvent event) {
		//engine.load("https://www.google.com");
		//engine.loadContent("<html>Hello</html>");
	}
	public void btn4(ActionEvent event) {
		//engine.reload();
		//engine.getHistory();
	}
}
