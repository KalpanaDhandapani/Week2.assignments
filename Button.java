package com.week2.assignments;

//Implement two subclasses, Button and TextField, both inheriting from the WebElement base class
public class Button extends WebElement {

	// In the Button subclass, include a submit() method
	public void submit() {
		System.out.println("ChildClass method: Button.submit()");
	}

}
