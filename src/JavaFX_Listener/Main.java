package application;
	
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;


public class Main extends Application {
	
	Button button;
	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			
			IntegerProperty intx = new SimpleIntegerProperty(3);
			IntegerProperty inty = new SimpleIntegerProperty(0);
			inty.bind(intx.multiply(2)); // whenever the intx value changes, the inty will have 1 added to it.
			System.out.println("x: " + intx.getValue() + " y: " + inty.getValue());
			intx.setValue(4);
			System.out.println("x: " + intx.getValue() + " y: " + inty.getValue());
			intx.setValue(8);
			System.out.println("x: " + intx.getValue() + " y: " + inty.getValue());
			
			Person bucky = new Person();
			bucky.firstNameProperty().addListener( (v, oldValue, newValue) -> {
				System.out.println("Name changed to: " + newValue);
				System.out.println("firstNameProperty: " + bucky.firstNameProperty());
				System.out.println("getFirstName: " + bucky.getFirstName());
			});
			button = new Button("Submit");
			button.setOnAction(e -> bucky.setFirstName("Change"));
			
			StackPane root = new StackPane();
			root.getChildren().add(button);
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
