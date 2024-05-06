package com.week2.assignments;

// Create a base class named WebElement with common methods such as click() and setText(String text).
public class WebElement {

	public void click() {
		System.out.println("BaseClass method: WebElement.click()");
	}

	public String setText(String text) {
		System.out.println("BaseClass method: WebElement.setText() : "+text);
		return text;
	}

}
