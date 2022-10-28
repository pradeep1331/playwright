package playwrightLearn;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Locator.DragToOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class leafgroundDrag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
				
				
		Page page = context.newPage();
		
		page.navigate("https://jqueryui.com/draggable/");
		
		//frames
		
		FrameLocator frame = page.frameLocator(".demo-frame");
	   
		Locator draggable = frame.locator("#draggable");
		
		DragToOptions settarget = new Locator.DragToOptions().setTargetPosition(200,200);
		
		draggable.dragTo(draggable, settarget);
		
		
		//find position
		
		
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
