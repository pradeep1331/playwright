package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class leafgroundframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://leafground.com/frame.xhtml");
		
		//frames
		
		
//		FrameLocator frame = page.frameLocator("(//iframe)[1]");
//		frame.locator("#Click").click();
//		
		
		FrameLocator parentFrame = page.frameLocator("(//iframe)[3]");
	    FrameLocator childFrame = parentFrame.frameLocator("#frame2"); 
	    childFrame.locator("#Click").click();
		
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
