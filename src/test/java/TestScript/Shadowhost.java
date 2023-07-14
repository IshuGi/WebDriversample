package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadowhost {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://watir.com/examples/shadow_dom.html");
		WebElement ShadowHost = driver.findElement(By.id("#shadow_host"));
		SearchContext context = ShadowHost.getShadowRoot();
		WebElement ShadowContent =context.findElement(By.cssSelector("#shadow_content"));
		System.out.println("Text"+ShadowContent.getText());

	}

}
