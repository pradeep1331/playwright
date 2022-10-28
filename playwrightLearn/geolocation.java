package playwrightLearn;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class geolocation {

	@Test  
	public static void geo() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		List<String> lst = new ArrayList<>();
		lst.add("geolocation");
		lst.add("geolocation");
		
		BrowserContext context = bw.newContext(
				new Browser.NewContextOptions()
				.setGeolocation(13.0836939,80.270186)
				.setPermissions(lst)
				
				
				);
				
	   Page page = context.newPage();
	   
	   page.navigate("https://www.gps-coordinates.net/my-location");
		page.waitForLoadState(LoadState.NETWORKIDLE);
		
		String innertext = page.locator("#addr").innerText();
		
		
		System.out.println(innertext);

        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();
		
		//spradeep1331-ecra@force.com

	}

}
