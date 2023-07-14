package TestScript;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) {
		// https://jqueryui.com/tooltip/
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		WebElement age = driver.findElement(By.cssSelector("#age"));
		Actions action = new Actions(driver);
		action.moveToElement(age).perform();
		//stem.out.println(driver.findElement(By.cssSelector(".ui-tooltipcontent"))).gettext());
		
		
		
		
		

	}

}
