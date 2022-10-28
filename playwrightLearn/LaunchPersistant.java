package playwrightLearn;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class LaunchPersistant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		BrowserContext context =  pw.chromium().
				launchPersistentContext(Paths.get("C:\\Users\\ADMIN\\AppData\\Local\\Google\\Chrome"),
				 new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false)
		
				);
		
		Page page = context.newPage();
	
				page.navigate("https://in.bookmyshow.com/");
		//frames		
		Thread.sleep(2000);
		page.close();
		
		pw.close();

	}

}
