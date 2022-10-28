package playwrightLearn;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;

public class StartDebugging {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().connectOverCDP("http://localhost:9222");
		
		List<BrowserContext> contexts =  bw.contexts();
		
		
		BrowserContext context = contexts.get(0);
		List<Page> pages = context.pages();
		System.out.println(pages.size());
		
		Page page = context.pages().get(0);
		
		
	    page.locator("text=CRM/SFA").click();
	    


	}

}

