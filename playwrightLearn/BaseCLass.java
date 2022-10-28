package playwrightLearn;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseCLass {
	
	
	public static Playwright pw;
	public static Browser bw;
	public static Page page;
	
	@BeforeTest
	public void login() {
		
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		int width = gd.getDisplayMode().getWidth();
		int height = gd.getDisplayMode().getHeight();
		
		
		pw = Playwright.create();
		bw = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	    page = bw.newPage();
		
		page.navigate("http://leaftaps.com/opentaps");
        page.setViewportSize(width, height);
	     page.locator("id=username").type("demosalesmanager");
	     page.locator("#password").type("crmsfa");
		
		
	}

}
