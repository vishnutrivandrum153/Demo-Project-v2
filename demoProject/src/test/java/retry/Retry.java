package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer  // intefface provided by TestNG to implement retry logic
{ 
	
	int counter = 0; 
	int retryLimit = 2; 
	 
	public boolean retry(ITestResult result)  //invoke when testcase fails
		{ 

			if(counter < retryLimit) 
				{ 
				counter++; 
				return true; 
				} 
			return false; //stop execution
		}

}
