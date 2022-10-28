package playwrightLearn;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Editlead extends BaseCLass  {
	 
	//package.classname.methodname
//	@Test(dependsOnMethods = "playwrightLearn.Createlead.createLead",retryAnalyzer = playwrightLearn.retryanalyzer.class);
	@Test(retryAnalyzer =  playwrightLearn.retryanalyzer.class)
	public static void editLead() {
	
	     page.locator("text=CRM/SFA").click();
	     page.locator("a:has-text('Leads')").click();
		 page.locator("a:has-text('Find Leads')").click();
		 page.locator("(//input[@name='firstName'])[3]").type("Babu");
		 page.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		 page.locator("(//a[@class='subMenuButton'])[3]").click();
		 page.locator("#updateLeadForm_firstName").fill("");
		 page.locator("#updateLeadForm_firstName").type("Babunew");
		 page.locator("//input[@value='Update']").click();
		 bw.close();
		 pw.close();
			
	}


}
