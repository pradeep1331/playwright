package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;

public class leafground2Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = bw.newPage();
		
		page.navigate("https://leafground.com/select.xhtmll");
		page.locator("(//button[@type='button'])[1]").click();
		page.goBack(new GoBackOptions().setWaitUntil(WaitUntilState.DOMCONTENTLOADED));
		System.out.println(page.locator("(//button[@type='button'])[2]").isEnabled());		
		page.locator("(//button[@type='button'])[3]").click();
		page.locator("(//button[@type='button'])[6]").hover();
		Thread.sleep(2000);
		System.out.println(page.locator("(//button[@type='button'])[6]/span").getAttribute("style"));
       page.locator("(//button[@type='button'])[7]").click();
		page.close();
		bw.close();
		pw.close();

	}

}
