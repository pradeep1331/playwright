package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class shadowDOMserviceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions()
				.setChannel("chrome").setHeadless(false)
				//.setSlowMo(2000)
				);
		
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://dev138341.service-now.com/now/appenginestudio/template");
		
		page.locator("#user_name").type("admin");
		page.locator("#user_password").type("fWDBjxa83@t$FiIA");
		page.click("#sysverb_login");
	//	page.click("//span[text()='x']");
		
	//	page.locator(".sn-aes").click();
		page.click("#my-appsNavItem");
		   Thread.sleep(3000);
		   page.locator("text=Create app").click();
		
	
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
