package TestScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, IOException {
		//https://demo.seleniumeasy.com/javascript-alert-box-demo.html
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File Scr = screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Scr, new File("C:\\Users\\Administrator\\Desktop\\New folder\\Fullscreen.png"));
		//we can take Screenshot for a particular image also
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(2000);
		//Confirmation Alert
				driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[1]")).click();
		Alert Conim = driver.switchTo().alert();
		System.out.println(Conim.getText());
		Conim.accept();
		

		Thread.sleep(2000);
		//Confirmation Alert
				driver.findElement(By.xpath("(//button[@class=\"btn btn-default btn-lg\"])[2]")).click();
		Alert Prompt = driver.switchTo().alert();
		Prompt.sendKeys("Kadavule");
		Thread.sleep(2000);
		System.out.println(Prompt.getText());
		Thread.sleep(2000);
		Conim.accept();
		
		

	}

}
