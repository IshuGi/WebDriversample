import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
  @Test(alwaysRun= true, dependsOnMethods="GoogleSearch")
  public void JavaSearch() {
	  
	  
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		System.out.println("Selenium page launched");
		
  }
  
@Test
 public void GoogleSearch() {
  
		driver.get("https://www.google.com/");
		SoftAssert softassert = new SoftAssert();
		softassert.fail("failed");
		System.out.println("running after script fail");
	
}
  @AfterTest
  
  public void DriverClose() {
	  driver.close();
  }
}
