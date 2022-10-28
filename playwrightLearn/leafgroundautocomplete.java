package playwrightLearn;

import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class leafgroundautocomplete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.
				LaunchOptions().setChannel("chrome").setHeadless(false)
				.setSlowMo(2000)
				);
		
		BrowserContext context = bw.newContext();
				
		context.grantPermissions(Arrays.asList("notifications"),
				new BrowserContext.GrantPermissionsOptions().setOrigin("https://jqueryui.com/autocomplete/"));
				
		Page page = context.newPage();
	page.navigate("https://jqueryui.com/autocomplete/");
		
		//frames
		
		FrameLocator frame = page.frameLocator(".demo-frame");
	   
		frame.locator(".ui-autocomplete-input").type("ac");
		page.keyboard().press("ArrowDown");
		page.keyboard().press("Enter");
		
	  
	    Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
