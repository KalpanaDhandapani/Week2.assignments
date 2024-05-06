/**
 * 
 */
package com.week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// launch the web driver
		ChromeDriver driver = new ChromeDriver();

		// load the url using get() method
		driver.get("http://leaftaps.com/opentaps/");

		// maximize the browser window
		driver.manage().window().maximize();

		// set the implicit wait of Selenium
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// advanced xpath locators: grandparent to grandchild & index based xpath
		// Enter an user name
		driver.findElement(By.xpath("(//form[@id='login']//input)[1]")).sendKeys("Demosalesmanager");
		// Enter a password
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");

		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();

		// advanced xpath locator: parent to child
		// Click on the "CRM/SFA" link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();

		// Click on Create Lead
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();

		// Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");

		// Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kalpana");

		// Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Prabhu");

		// Enter the FirstName (Local) Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Kalpana");

		// Enter the Department Field Using any Locator of Your Choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Quality Department");

		// Enter the Description Field Using any Locator of your choice.
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"))
				.sendKeys("EditLead Assignment create");

		// Enter your email in the E-mail address Field using the locator of your
		// choice.
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("dskalpana19@gmail.com");

		// Select State/Province as NewYork Using Visible Text.
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(stateElement);
		state.selectByVisibleText("New York");

		// Click on Create Button.
		driver.findElement(By.className("smallSubmit")).click();

		// Click on the edit button.
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[contains(text(),'Edit')]")).click();

		// Clear the Description Field using .
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();

		// Fill Important Note Field with Any text.
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("EditLead assignment update");

		// Click on the update button.
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

		// Get the Title of the Resulting Page.
		String resultPageTitle = driver.getTitle();
		System.out.println("Resulting page title : " + resultPageTitle);

		// Close the browser window.
		driver.close();
	}
}