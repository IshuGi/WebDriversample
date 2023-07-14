package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ifrmae {

	public static void main(String[] args) {
		//https://chercher.tech/practice/frames-example-selenium-webdriver
		WebDriver driver = new ChromeDriver();
		//main page to frame1
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hello Ishwarya");
		//frame3 to frame1
		//driver.switchTo().frame("frame3"); 
		driver.switchTo().frame(0);
		driver.findElement(By.id("a")).click();
		//from frame3 to frame1 .. here we are using parent frame since frame 1 is immediate parent of frame3
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Ishwarya you are great");
		
		//from any frame to main page 
		driver.switchTo().defaultContent();
		
		//from main page to sec frame
		//driver.switchTo().frame("frame2");
		driver.switchTo().frame(1);
		WebElement drop = driver.findElement(By.id("animals"));
		System.out.println(driver.findElement(By.id("animals")).getText());
		Select dropdown = new Select(driver.findElement(By.id("animals")));
		
		dropdown.selectByIndex(1);
		
		
		
		

	}

}
