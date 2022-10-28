package playwrightLearn;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DeleteLead {
	
	@Test
	public void deleteLead() throws InterruptedException {
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
		
		Playwright pw = Playwright.create();
		Browser broswer = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = broswer.newPage();
		
	
	     page.locator(".decorativeSubmit").click();
	     page.locator("text=CRM/SFA").click();
	     page.locator("a:has-text('Leads')").click();
		 page.locator("a:has-text('Find Leads')").click();
		 page.locator("(//span[@class='x-tab-strip-text '])[2]").click();
		 page.locator("//input[@name='phoneNumber']").type("9");
		 page.locator("//button[contains(text(),'Find Leads')]").click();
		 Thread.sleep(1000);
		 String leadId = page.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").innerText();
		 System.out.println(leadId);
		 page.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
		 page.locator(".subMenuButtonDangerous").click();
		 page.locator("//a[contains(text(),'Find Leads')]").click();
		 page.locator("//input[@name='id']").type(leadId);
		 page.locator("(//button[@class='x-btn-text'])[7]").click();
		 Thread.sleep(1000);
		 String innerText = page.locator("//div[@class='x-paging-info']").innerText();	 
		 System.out.println(innerText);
		 pw.close();
	}

}
