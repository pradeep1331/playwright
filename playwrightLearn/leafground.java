package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class leafground {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = bw.newPage();
		
		page.navigate("https://leafground.com/input.xhtml");
		page.locator("//input[@placeholder='Babu Manickam']").type("Pradeep");
        page.locator("(//input[@type='text'])[3]").fill("");
        page.locator("(//input[@type='text'])[3]").fill("Chennai,Mogappair");
        System.out.println(page.locator("(//input[@type='text'])[4]").isEnabled());
        page.locator("(//input[@type='text'])[5]").fill("");
        String val = page.locator("(//input[@type='text'])[5]").getAttribute("value");
        System.out.println(val);
        page.locator("(//div[@class='ql-editor ql-blank'])[1]").fill("Hi how are you");
        page.locator("(//input[@type='text'])[9]").press("Enter");
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
