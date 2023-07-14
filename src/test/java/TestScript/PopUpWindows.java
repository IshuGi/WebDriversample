package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sqatools.com/demo/Windows.php");
		//WebElement se =driver.findElement(By.xpath("//input[@class=\"form-control form-control-lg\"]"));

	}

}
