package com.week2.assignments;

// Create a Java class named APIClient and create two methods with the same name passing different input arguments.
// Method Overloading in Java OOPS concept-Polymorphism
public class APIClient {

	public static void main(String[] args) {

		APIClient api = new APIClient(); // class object creation

		// calling methods
		api.sendRequest("https://www.facebook.com/");
		api.sendRequest("https://www.facebook.com/", "hello", true);
	}

	// One method should accept one input argument: a String for the endpoint
	public String sendRequest(String endpoint) {
		System.out.println("same method name + 1 input arg: endpoint = " + endpoint);
		return endpoint;
	}

	// sendRequest method should accept three input arguments:
	// a String for the endpoint,
	// a String for the requestBody,
	// and a boolean parameter requestStatus to verify whether the request is
	// successful
	public String sendRequest(String endpoint, String requestBody, Boolean requestStatus) {
		System.out.println("same method name + 3 input args: endpoint = " + endpoint + "; requestBody = " + requestBody
				+ "; requestStatus = " + requestStatus);
		return endpoint;
	}
}
