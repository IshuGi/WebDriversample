package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Thread.sleep(2000);
		Select drop = new Select(driver.findElement(By.id("select-demo")));
		drop.selectByVisibleText("Sunday");
		System.out.println("Dropdown is selected");
		
		Select Multidrop = new Select(driver.findElement(By.id("multi-select")));
		Multidrop.selectByValue("California");
		Multidrop.selectByIndex(7);
		Multidrop.selectByVisibleText("New Jersey");
		Thread.sleep(2000);
		System.out.println("MultiDropdown is selected");
		
		
		List<WebElement> selected =  Multidrop.getAllSelectedOptions();
		int size = selected.size();
	
		System.out.println("Dimension" +size);
		
		
		Multidrop.deselectAll();
		
		

	}

}
