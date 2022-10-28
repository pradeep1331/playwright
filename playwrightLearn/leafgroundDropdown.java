package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class leafgroundDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = bw.newPage();
		
		page.navigate("https://leafground.com/select.xhtml");
		page.locator("//select[@class='ui-selectonemenu']").selectOption("Selenium");
		
		page.locator("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[1]").click();
		page.locator("//li[@data-label='India']").click();
		
		page.locator("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[2]").click();
		page.locator("//li[@data-label='Chennai']").click();
		
		page.locator("(//button[@role='button'])[1]").click();
		page.locator("//li[@data-item-label='Playwright']").click();
        Thread.sleep(4000);

        page.locator("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[3]").click();
        page.locator("//li[@data-label='Tamil']").click();
        
        page.locator("(//label[@class='ui-selectonemenu-label ui-inputfield ui-corner-all'])[4]").click();
        page.locator("(//li[@tabindex='-1'])[20]").click();
        
        page.close();
        bw.close();
        pw.close();
	}

}
