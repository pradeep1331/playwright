package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ConsoleMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
		Page page = context.newPage();
		
		page.onConsoleMessage(handler->{
			
			if(handler.type().equals("error")) {
			System.out.println(page.url());
		  System.out.println(handler.text());
		  System.out.println(handler.type());
			}
		  
		
		});
		
		page.navigate("https://leafground.com/");
		

	
        Thread.sleep(2000);
		page.close();
		bw.close();
		pw.close();
		
		//spradeep1331-ecra@force.com

	}

}
