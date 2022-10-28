package playwrightLearn;

import java.util.List;

import com.deque.html.axecore.playwright.AxeBuilder;
import com.deque.html.axecore.results.Rule;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.BoundingBox;

public class leafgroundactionsflipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Playwright pw = Playwright.create();
		Browser bw = pw.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false));
		
		BrowserContext context = bw.newContext();
	
	    
	
		
				
		Page page = context.newPage();
		AxeBuilder axeBuilder = new AxeBuilder(page);
	    List<Rule> violations = axeBuilder.analyze().getViolations();
	    System.out.println(violations);
		page.navigate("https://jqueryui.com/droppable/");
		
		//frames
		
		FrameLocator frame = page.frameLocator(".demo-frame");
	   
		Locator draggable = frame.locator("#draggable");
		Locator droppable = frame.locator("#droppable");
		
		draggable.dragTo(droppable);
		
		//find position
		BoundingBox bound =  draggable.boundingBox();
		
		System.out.println(bound.x);
		System.out.println(bound.y);
		
		System.out.println(droppable.textContent());
		
		//System.out.println(droppable.getAttribute("background-color"));
		
        Thread.sleep(4000);
		page.close();
		bw.close();
		pw.close();

	}

}
