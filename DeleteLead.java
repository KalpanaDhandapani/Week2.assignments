package com.week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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

		// advanced xpath locator: grandparent to grandchild
		// Click the "Leads" link
		driver.findElement(By.xpath("//div[@class='x-panel-tc']//a[contains(text(),'Leads')]")).click();

		// advanced xpath locator: elder cousin to younger cousin
		// Click the "Find Leads" link
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]/following::a[contains(text(),'Find Leads')]"))
				.click();

		// Click on the "Phone" tab.
		driver.findElement(By.xpath("(//span[contains(@class,'x-tab-strip-inner')]/span)[2]")).click();

		// Enter the phone number.
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("91");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543211");

		// Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

		Thread.sleep(3000);
		WebElement leadId = driver
				.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td/div/a)[1]"));

		// Capture the lead ID of the first resulting lead.
		String leadID = leadId.getText();
		System.out.println("First Lead ID of resulting lead table:  " + leadID);
		// Click the first resulting lead.
		leadId.click();

		// Click the "Delete" button.
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']/a[@class='subMenuButtonDangerous']")).click();

		// Click "Find leads" again.
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]/following::a[contains(text(),'Find Leads')]"))
				.click();

		System.out.println("First Lead ID of resulting lead table: 2 === " + leadID);

		// Enter the captured lead ID.
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).sendKeys(leadID);

		// Click the "Find leads" button.
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		// Verify the presence of the message "No records to display" in the Lead List.
		// This
		// message confirms the successful deletion.

		// advance xpath locator: parent to child
		WebElement noRecord = driver.findElement(By.xpath("//div[contains(@id,'ext-gen304')]/div"));
		String str = noRecord.getText();
		System.out.println("str " + str);
		if (str.contains("Displaying records 1")) {
			System.out.println("Deletion of lead is success");
		} else {
			System.out.println("Deletion of lead is not successful");
		}

		// Close the browser.
		driver.close();
	}
}