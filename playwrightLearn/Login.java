package playwrightLearn;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Playwright pw = Playwright.create();
		
	
		Browser browser = pw.chromium().launch( new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		BrowserContext context = browser.newContext();
	     Page page = context.newPage();
	     page.setViewportSize(1200, 800);
	     page.navigate("http://leaftaps.com/opentaps");
	     
	 	page.navigate("http://leaftaps.com/opentaps");
	     page.locator("id=username").type("demosalesmanager");
	     page.locator("#password").type("crmsfa");
	     page.locator(".decorativeSubmit").click();
	     
	     context.storageState(new BrowserContext.StorageStateOptions().setPath(Paths.get("login_leaftaps.json")));
	     
	     pw.close();
	}
	
	

}
