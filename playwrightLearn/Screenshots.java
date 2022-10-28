package playwrightLearn;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;

public class Screenshots {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		page.navigate("http://leaftaps.com/opentaps");
     
		page.screenshot(new Page.ScreenshotOptions()
				.setFullPage(true)
				.setPath(Paths.get("screenprints/lg_page.png"))
				
				);
		
//		   page.locator("#username").screenshot(
//		    		 new Locator.ScreenshotOptions()
//		    		 .setPath(Paths.get("screenprints/l_page.png"))
//		    		 ) ;
//		
	     page.locator("id=username").type("demosalesmanager");
	     
	  
	     page.locator("*:focus").getAttribute("id");
	 
	  
		page.close();
		bw.close();
		pw.close();
	}

}
