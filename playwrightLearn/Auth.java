package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Auth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser broswer = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext context = broswer.newContext(
				
				new Browser.NewContextOptions().setHttpCredentials("admin","admin"));
		
		Page page = context.newPage();
		
       page.navigate("https://the-internet.herokuapp.com/basic_auth");
	}

}
