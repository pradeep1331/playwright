package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class W3schools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		FrameLocator Parentframe = page.frameLocator("//iframe[@id='iframeResult']");
		
page.onceDialog(dialog ->{
			
			String mes = dialog.message();
			System.out.println(mes);
			dialog.accept("Pradeep");
			
		});
		Parentframe.locator("//button[@onclick='myFunction()']").click();
		
       
	Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
