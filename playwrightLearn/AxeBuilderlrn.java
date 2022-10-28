package playwrightLearn;

import java.nio.file.Paths;
import java.util.List;


import com.deque.html.axecore.playwright.AxeBuilder;
import com.deque.html.axecore.results.Rule;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;


public class AxeBuilderlrn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		BrowserContext context =  pw.chromium().
				launchPersistentContext(Paths.get("C:\\Users\\ADMIN\\AppData\\Local\\Google\\Chrome"),
				 new BrowserType.LaunchPersistentContextOptions().setChannel("chrome").setHeadless(false)
		
				);
		
		Page page = context.newPage();
	
		page.navigate("https://www.bookmyshow.com/");
		//frames	
		
		AxeBuilder axeBuilder = new AxeBuilder(page);
	    List<Rule> violations = axeBuilder.analyze().getViolations();
	    
	    System.out.println(violations);
		
	  
	 		
		Thread.sleep(2000);
		page.close();
		
		pw.close();

	}

}
