package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	private StringProperty firstName = new SimpleStringProperty(this, "firstName", "");

	public StringProperty firstNameProperty() { // returns the stringProperty object
		return firstName;
	}
	
	public String getFirstName() { // returns the firstName string (standard accessor)
		return firstName.get();
	}

	public void setFirstName(String firstName) { // sets the firstName string (standard mutator)
		this.firstName.set(firstName);
	}
	
	
}
