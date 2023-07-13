package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://demo.opencart.com/");
		WebElement se =driver.findElement(By.xpath("//input[@class=\"form-control form-control-lg\"]"));
		//se.sendKeys("phone");
		System.out.println("search is done");
		Actions action = new Actions(driver);
		//action.contextClick(se).perform();
		System.out.println("Context click is done");
		Thread.sleep(2000);
		
		
		WebElement menu =driver.findElement(By.xpath("(//a[@href=\"https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=25\"])[1]"));
		
		action.moveToElement(menu).perform();
		
		WebElement submenu = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[3]/div/div/ul/li[2]/a"));
		action.moveToElement(menu).click(submenu).build().perform(); // to move to element and to click on submenu
		
		driver.get("https://www.sqatools.com/demo/Doublelick.php");
		
	}

}
