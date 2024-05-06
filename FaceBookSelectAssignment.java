package com.week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelectAssignment {

	public static void main(String[] args) {

		// launch the web driver
		ChromeDriver driver = new ChromeDriver();

		// load the url using get() method
		driver.get("https://www.facebook.com/");

		// maximize the browser window
		driver.manage().window().maximize();

		// implicit wait statement to find the elements of a page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Click on the Create new account button.
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		// Enter the First name.
		driver.findElement(By.name("firstname")).sendKeys("AAAA");

		// Enter the Surname.
		driver.findElement(By.name("lastname")).sendKeys("BBBB");

		// Enter the Mobile number or email address.
		driver.findElement(By.xpath("//input[contains(@name,'reg_email')]")).sendKeys("test12@testmail.com");

		// Enter the New password.
		driver.findElement(By.xpath("//input[contains(@name,'reg_passwd')]")).sendKeys("welcome123$");

		// Handle all three dropdowns in Date of birth
		WebElement dayElement = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayElement);
		daySelect.selectByValue("16"); // select by value

		WebElement monthElement = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthElement);
		monthSelect.selectByVisibleText("Feb"); // select by visible text

		WebElement yearElement = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByValue("2012"); // select by value

		// Select the radio button in Gender.
		WebElement genderElement = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		genderElement.click();
	}
}