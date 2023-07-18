import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Yes {
	 @Test(groups="two")
	  public void first() {
		 System.out.println("One");
		 
	}
	 @Test(groups="one")
	 public void second() {
		 System.out.println("two"); 
	 }
	 @Test
	 
	 public void third() {
		 System.out.println("three");
	 }
}
