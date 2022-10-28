package playwrightLearn;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;

public class getCDP_Details {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions()
				.setArgs(Arrays.asList("--remote-debugging-port=9222"))
				.setChannel("chrome")
				.setHeadless(false)
				
				);
		
		BrowserContext context = bw.newContext();
				
		// Listen to console message		
		Page page = context.newPage();
		
		   page.navigate("http://leaftaps.com/opentaps/control/main");
		   
		     page.locator("id=username").type("democsr");
		     page.locator("#password").type("crmsfa");
		     page.locator(".decorativeSubmit").click();
		 
     
	}

}

