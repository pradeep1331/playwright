package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class leaftapswindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
	   page.navigate("http://leaftaps.com/opentaps/control/main");
	   
	     page.locator("id=username").type("democsr");
	     page.locator("#password").type("crmsfa");
	     page.locator(".decorativeSubmit").click();
	     page.locator("text=CRM/SFA").click();
	     page.locator("a:has-text('Contacts')").click();
	     page.locator("a:has-text('Merge Contacts')").click();
	     page.locator("(//img[@src='/images/fieldlookup.gif'])[1]").click();
	     
	     Thread.sleep(2000);
	   //wait for page element to exist
	  Page newPage = context.waitForPage(()->{
		  page.locator("//span[@class='subSectionTitle']"); 
	   });
	    
	  Thread.sleep(5000);
	   String val1 = newPage.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").innerText();
	   System.out.println(val1);
	    Thread.sleep(2000);
	   newPage.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	     Thread.sleep(2000);
	    page.locator("(//img[@src='/images/fieldlookup.gif'])[2]").click();
	  
	     Thread.sleep(2000);
		   //wait for page element to exist
		  Page newPage2 = context.waitForPage(()->{
			  page.locator("//span[@class='subSectionTitle']"); 
		   });
		  
		  //handling alert
		  page.onceDialog(dialog ->{
				
				String mes = dialog.message();
				System.out.println(mes);
				dialog.accept();
			});
		
		    
		  Thread.sleep(2000);
		  String val2 = newPage2.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").innerText();
		  System.out.println(val2);
		  Thread.sleep(2000);
		  newPage2.locator("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]").click();
          
		  Thread.sleep(2000);
		  page.locator("//a[@class='buttonDangerous']").click();
		  
		  Thread.sleep(5000);
		  
		  pw.close();
		  
//		  page.locator("//a[contains(text(),'Find Leads')]").click();
//			 page.locator("//input[@name='id']").type(val1);
//			 page.locator("(//button[@class='x-btn-text'])[7]").click();
//			 Thread.sleep(1000);
//			 String innerText = page.locator("//div[@class='x-paging-info']").innerText();	 
//			 System.out.println(innerText);
//			 pw.close();
	}

}
