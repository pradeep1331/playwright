package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class NetworkRequests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
		// Listen to console message
		
		
				
		Page page = context.newPage();
		
		page.onRequest(handler->{
			
			if(handler.url().contains("create")) {
				
				System.out.println(handler.url());
			}			
		});
		
         page.onConsoleMessage(handler->{
			
        	 handler.text();
		});
		
		
		
		
		page.navigate("https://login.salesforce.com/");
		
		page.locator("#username").type("ramkumar.ramaiah@testleaf.com");
		page.locator("#password").type("Password#123");
		page.locator("#Login").click();
		page.locator(".slds-icon-waffle").click();
		page.click("(//p[text()='Service'])[1]");
		page.click("(//span[text()='Accounts'])[1]");
		page.click("(//div[@title='New'])[1]");
		
		
		

        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();
		
		//spradeep1331-ecra@force.com

	}

}
