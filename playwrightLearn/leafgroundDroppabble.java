package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class leafgroundDroppabble {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions()
				.setChannel("chrome").setHeadless(false)
				.setSlowMo(2000)
				);
		
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://www.amazon.in/");
		
	//	page.click("//span[text()='x']");
		
		page.hover("//span[@class='nav-line-2 ']");
		page.locator("(//span[@class='nav-action-inner'])[1]").click();
		//frames
	
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
