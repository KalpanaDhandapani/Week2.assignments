package com.week2.assignments;

// Create subclasses and create 2 methods in each
public class LoginTestData extends TestData {

	public static void main(String[] args) {
		LoginTestData ld = new LoginTestData(); // class object creation

		// access super class methods + its own class methods
		ld.enterCredentials();
		ld.navigateToHomePage();
		ld.enterUsername();
		ld.enterPassword();
	}

	// enterUsername()
	public void enterUsername() {
		System.out.println("ChildClass method: LoginTestData.enterUsername()");
	}

	// enterPassword()
	public void enterPassword() {
		System.out.println("ChildClass method: LoginTestData.enterPassword()");
	}
}