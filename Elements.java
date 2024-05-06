package com.week2.assignments;

// Create execution class named , also inheriting from the Button subclass.
public class Elements extends Button {

	public static void main(String[] args) {
		// Finally, in a separate class Elements create objects for sub classes and call
		// their respective methods..

		// child classes of superclass: WebElement
		Button button = new Button();
		TextField textField = new TextField();

		// child classes of superclass: Button
		CheckBoxButton cb = new CheckBoxButton();
		RadioButton rb = new RadioButton();
		Elements el = new Elements();

		// calling their respective methods
		button.click();
		button.setText("call from child class Button");
		button.submit();
		System.out.println("*************************************************");
		
		textField.click();
		textField.setText("call from child class TextField");
		textField.getText();
		System.out.println("*************************************************");
		
		cb.click();
		cb.setText("call from child class CheckBoxButton");
		cb.submit();
		cb.clickCheckButton();
		System.out.println("*************************************************");
		
		rb.click();
		rb.setText("call from child class RadioButton");
		rb.submit();
		rb.selectRadioButton();
		System.out.println("*************************************************");
		
		el.click();
		el.setText("call from child class Elements");
		el.submit();
	}
}