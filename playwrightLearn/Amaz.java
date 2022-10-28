package playwrightLearn;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Amaz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		
		BrowserContext context = bw.newContext(
				new Browser.NewContextOptions()
				.setViewportSize(1200,1200)				
				);
				
				
		Page page = context.newPage();
		
		page.navigate("https://www.amazon.in/");
		page.locator("#nav-search-dropdown-card").click();
		page.locator("#searchDropdownBox").selectOption("search-alias=electronics");

		page.locator("#twotabsearchtextbox").type("mobile");
        page.locator("#nav-search-submit-button").click();
        Thread.sleep(4000);
		Locator elements = page.locator("//div[@class='a-section a-spacing-none puis-padding-right-small s-title-instructions-style']/h2/a");
		
		int count = elements.count();
		System.out.println(count);
		
		page.locator("(//span[contains(@class,'a-size-medium a-color-base')])[3]").click();
		
		Thread.sleep(2000);
	    
		Page newPage2 = context.waitForPage(()->{
			  page.locator("//span[text()='Android 12']"); 
		   });
		
		System.out.println(newPage2.locator("//span[text()='Android 12']").innerText());	
		
		newPage2.locator("//div[@id='imgTagWrapperId']/img").hover();
		
		
		
		Thread.sleep(4000);
		
		
		
		page.close();
		bw.close();
		pw.close();

	}

}
