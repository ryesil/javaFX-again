package application;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class ObservableProperty {

	public static void main(String[] args) {
	DoubleProperty balance=new SimpleDoubleProperty();
	balance.addListener(new InvalidationListener() {

		@Override
		public void invalidated(Observable arg0) {
			System.out.println("The new value is "+ balance.doubleValue());
			
		}
		
	});
	balance.set(4.5);

	}

}
