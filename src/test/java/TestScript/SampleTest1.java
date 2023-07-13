package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest1 {

	public static void main(String[] args) throws InterruptedException {
		// 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
		//https://github.com/IshuGi/WebDriversample.git
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
//		driver.findElement(By.cssSelector("#searchBar")).sendKeys("Test");
//		Thread.sleep(2000);
//		WebElement Close= driver.findElement(By.xpath("/a[@title='Clear text']"));
//		if(Close.isDisplayed()) {
//			Close.click();
//		
	WebElement optchec =driver.findElement(By.xpath("(//input[@class=\"cb1-element\"])[2]"));
	if(!optchec.isSelected())
	{
		optchec.click();
		Thread.sleep(2000);
	System.out.println("optcheck is not selected");
	
		
	}
	

	}
	
	
}
