package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Browser.NewContextOptions;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MobileEmulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext(
				new Browser.NewContextOptions()
				.setViewportSize(390,844)
				
				
				);
				
	 
				
		Page page = context.newPage();
		page.navigate("http://leaftaps.com/opentaps");
     
	     page.locator("id=username").type("demosalesmanager");
	     page.locator("*:focus").getAttribute("id");
	 
	  
	Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
