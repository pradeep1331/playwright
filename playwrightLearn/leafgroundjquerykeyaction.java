package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class leafgroundjquerykeyaction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions()
				.setChannel("chrome").setHeadless(false)
				.setSlowMo(2000)
				);
		
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://www.geeksforgeeks.org/");
		
	//	page.click("//span[text()='x']");
		
		page.hover("//span[text()='Tutorials']");
		page.hover("//span[text()='Data Structures']");
		page.locator("(//a[text()='Arrays'])[1]").click();
		//frames
		
		
		
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
