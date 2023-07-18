package ParallelExecution;

import org.testng.annotations.Test;

public class Sampletwo {
	  @Test(invocationCount=6,threadPoolSize= 3, timeOut=2000)
	  public void five() {
		  System.out.println("five");
	  }
	  
	  @Test
	  public void six() {
		  System.out.println("six");
	  }
	  
}
