package com.week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownElements {

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
		// Enter the username as ‘demosalesmanager’
		driver.findElement(By.xpath("(//form[@id='login']//input)[1]")).sendKeys("Demosalesmanager");
		// Enter the password as 'crmsfa'
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");

		// Click the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();

		// advanced xpath locator: parent to child
		// Click on the "CRM/SFA" link
		driver.findElement(By.xpath("//div[@id='label']/a")).click();

		// advanced xpath locator: grandparent to grandchild
		// Click the "Leads" link
		driver.findElement(By.xpath("//div[@class='x-panel-tc']//a[contains(text(),'Leads')]")).click();

		// Click on the Create Lead link from shortcuts.
		driver.findElement(By.linkText("Create Lead")).click();

		// Enter the CompanyName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Infosys");

		// Enter the FirstName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Kalpana");

		// Enter the LastName Field Using Xpath.
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Prabhu");

		// Enter the mandatory fields on the web page.
		// Select Employee in the source dropdown (using index)
		WebElement sourceElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceSelect = new Select(sourceElement);
		sourceSelect.selectByIndex(4);

		// Select Automobile in the Marketing Campaign (using visibleText)
		WebElement marketingElement = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingSelect = new Select(marketingElement);
		marketingSelect.selectByVisibleText("Automobile");

		// Select Corporation in Ownership (using value)
		WebElement ownerElement = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownerSelect = new Select(ownerElement);
		ownerSelect.selectByValue("OWN_CCORP");

		// Click on the Create Lead button.
		driver.findElement(By.className("smallSubmit")).click();

		// Verify the title of the current web page.
		String currentPageTitle = driver.getTitle();
		System.out.println("currentPageTitle = " + currentPageTitle);

		if (currentPageTitle.contains("View Lead | opentaps CRM")) {
			System.out.println("Lead creation is successful ");
		} else {
			System.out.println("Lead creation is not successful");
		}
		// Close the browser window.
		driver.close();
	}
}