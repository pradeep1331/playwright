package playwrightLearn;

import java.nio.file.Paths;

import javax.naming.Context;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Autologin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Playwright pw = Playwright.create();
		 
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setStorageStatePath(Paths.get("login_leaftaps.json")));
		
		Page page = context.newPage();
				
				
	}

}
