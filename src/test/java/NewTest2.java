import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void opencartsearch() {
	// TODO Auto-generated method stu
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
	
}
}
