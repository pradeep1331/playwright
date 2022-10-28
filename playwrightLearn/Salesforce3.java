package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Salesforce3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
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
		
		page.locator("//li[@data-target-selection-name='sfdc:StandardButton.Opportunity.New']").click();
		
		page.locator("(//div[@class='slds-form-element__control slds-grow']/input)[1]").type("Salesforce Automation");
		page.locator("(//input[@class='slds-combobox__input slds-input'])[1]").type("Pradeep");
		page.locator("//lightning-base-combobox-formatted-text[@title='Pradeep']").click();
		page.locator("//input[@name='CloseDate']").click();
		page.click("text=Today");
		
		page.locator("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]").click();
		page.locator("//span[@title='Proposal']").click();
		page.locator("//button[@name='SaveEdit']").click();
		
		
		
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
