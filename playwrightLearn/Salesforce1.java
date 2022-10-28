package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Salesforce1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
		// Listen to console message
		
		
				
		Page page = context.newPage();
		
		
		
		page.navigate("https://fiserv-3a.my.salesforce.com");
		
		page.locator("#username").type("spradeep1331-ecra@force.com");
		page.locator("#password").type("Scsp1111");
		page.locator("#Login").click();
		
		Thread.sleep(8000);
		
		page.locator(".slds-icon-waffle").click();
		page.locator("//button[@aria-label='View All Applications']").click();
		
		page.locator("(//div[@class='slds-app-launcher__tile-body slds-truncate'])[1]").click();
		page.locator("(//span[@class='slds-truncate'])[6]").click();
		
		page.locator("//a[@title='Sales force Automation']").click();
		
		page.locator("//button[@name='Delete']").click();
	    page.locator("button.slds-button.slds-button--neutral.uiButton--default.uiButton--brand.uiButton.forceActionButton").click();
		
		
		
		// name = Sales force Automation
		
		
//		FrameLocator frame = page.frameLocator("(//iframe)[1]");
//		frame.locator("#Click").click();
//		
//		
//		FrameLocator parentFrame = page.frameLocator("(//iframe)[3]");
//	    FrameLocator childFrame = parentFrame.frameLocator("#frame2"); 
//	    childFrame.locator("#Click").click();
		
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();
		
		//spradeep1331-ecra@force.com

	}

}
