package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType;
public class Playwirghtbase {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize playwrightP
		Playwright playwright = Playwright.create();
		
		// launch broswer (CDT API )
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		//launch url
		Page page = browser.newPage();
		page.navigate("http://leaftaps.com/opentaps");
		
		
		
		String title = page.title();
		System.out.println(title);
		String url = page.url();
		System.out.println(url);
		
		page.close();
		browser.close();
		playwright.close();	
	
	}
}