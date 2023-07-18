package TestScript;

import org.testng.annotations.Test;

public class sampletestng {
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
