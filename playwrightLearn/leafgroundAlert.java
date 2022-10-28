package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class leafgroundAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://leafground.com/alert.xhtml");
		
		
		page.onceDialog(dialog ->{
			
			String mes = dialog.message();
			System.out.println(mes);
			dialog.accept();
			
			
		});
		page.locator("(//h5[contains(text(),' Alert (Simple Dialog)')]/following::span)[2]").click();
		//listener
		
		
		
	page.onceDialog(dialog ->{
			
			String mes = dialog.message();
			System.out.println(mes);
			dialog.dismiss();
		});
	
	
	
    page.locator("(//h5[contains(text(),' Alert (Simple Dialog)')]/following::span)[5]").click();
    
    System.out.println(page.locator("//span[@id='result']").innerText());
//	
//	
//	page.onceDialog(dialog ->{
//		
//		String mes = dialog.message();
//		System.out.println(mes);
//		dialog.accept("hello");
//	});
//	
       
	Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
