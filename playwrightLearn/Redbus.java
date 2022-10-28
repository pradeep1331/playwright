package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = bw.newPage();
		page.navigate("https://www.redbus.com/");
		Thread.sleep(3000);
		page.locator("//input[@id='src']").type("Chennai, Tamil Nadu, India");
		page.keyboard().press("Tab");
		page.locator("//input[@id='dest']").type("Madurai, Tamil Nadu, India");
		page.keyboard().press("Tab");
		page.locator("#onward_cal").click();
		page.locator("(//div[@class='DayTiles__CalendarDaysBlock-sc-14em0t0-0 eUrtce'])[7]").click();
		page.locator(".search-lbl").click();

	}

}
