package playwrightLearn;

import java.nio.file.Paths;
import java.util.List;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Tracing;
import com.microsoft.playwright.Tracing.StartOptions;
import com.microsoft.playwright.Video;

public class Traceviewer {

	@Test
	public static void createLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		
		Browser browser = pw.chromium().launch( new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context= browser.newContext(new Browser.NewContextOptions()
				   .setRecordVideoDir(Paths.get("screenprints"))
				  
				);
		
		//Enable trace
		context.tracing().start(
			  new Tracing.StartOptions()
			  .setName("Create_Lead_trace")
			  .setSnapshots(true)
			  .setScreenshots(true)
				
				
				);
		
	     Page page = context.newPage();
	     Video video = page.video();
	     page.setViewportSize(1200, 800);
	     page.navigate("http://leaftaps.com/opentaps");
	     
	     page.locator("id=username").type("democsr");
	     page.locator("#password").type("crmsfa");
	     page.locator(".decorativeSubmit").click();
	     page.locator("text=CRM/SFA").click();
	     page.locator("a:has-text('Leads')").click();
	     page.locator("text=Create Lead").click();
	    // Thread.sleep(2000000);
	   //  page.locator("#createLeadForm_dataSourceId").selectText();
	     page.locator("#createLeadForm_dataSourceId").selectOption("LEAD_COLDCALL");
	     //find all inner text
	     
	     Locator options =  page.locator("#createLeadForm_dataSourceId >option");
	     
	     List<String> allinnerTexts = options.allInnerTexts();
	     
	     for (String itext : allinnerTexts) {
		
	    	 System.out.println(itext);
		}
	      
	     page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("screenprints/sample1.jpg")));
	     	     
	     
	     context.tracing().stop(
	    		 new Tracing.StopOptions().setPath(Paths.get("screenprints/createleadtrace.zip"))
	    		 );
	     page.close();
	     
	     video.saveAs(Paths.get("screenprints/samplevid.webm"));
	     browser.close();
	     pw.close();
	     
	     
	 //    page.locator('#createLeadForm_company');	 
	}

}
