package com.week2.assignments;

// Create a superclass as TestData
public class TestData {

	public static void main(String[] args) {
		// class object creation
		TestData td = new TestData();

		// its own class methods
		td.enterCredentials();
		td.navigateToHomePage();

	}
	// Implement 2 methods: enterCredentials(), navigateToHomePage() in the TestData
	// class.
	public void enterCredentials() {
		System.out.println("SuperClass method: TestData.enterCredentials()");
	}

	public void navigateToHomePage() {
		System.out.println("SuperClass method: TestData.navigateToHomePage()");
	}
}