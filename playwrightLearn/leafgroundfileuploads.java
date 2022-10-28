package playwrightLearn;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.GoBackOptions;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.WaitUntilState;

public class leafgroundfileuploads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		Page page = bw.newPage();
		
		page.navigate("https://leafground.com/file.xhtml");
	    
		page.locator("(//input[@type='file'])[1]").setInputFiles(Paths.get("C:/Users/ADMIN/Desktop/sample.txt"));
		
		System.out.println(page.locator(".ui-fileupload-filename").innerText());
		
		Download  download = page.waitForDownload(()->{
			page.locator("(//span[@class='ui-button-text ui-c'])[2]").click();
			
		});
		System.out.println(download.url());
		System.out.println(download.path().getFileName());
		System.out.println(download.path());
		
		// to save in a specific pathdownload.saveAs(null);
		
		
		
		Thread.sleep(5000);
		page.close();
		bw.close();
		pw.close();

	}

}
