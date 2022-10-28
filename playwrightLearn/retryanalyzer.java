package playwrightLearn;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retryanalyzer extends BaseCLass implements IRetryAnalyzer{

	 int numRetry = 0 ;
	@Override
	public boolean retry(ITestResult result) {
		
		if(numRetry < 1) {
			numRetry++;
			return true;
			
		}
		return false;
	}
	
	
	
}
