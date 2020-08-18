package scripts;

import org.testng.annotations.Test;

import config.StartBrowser;
import reuse.BusinessFunctions;

@Test
public class TC02 extends StartBrowser {
	
	public void testLogin() throws Exception {
		BusinessFunctions bsnsFction = new BusinessFunctions();
		bsnsFction.login();
	}
	
	public void testLogout() throws Exception {
		BusinessFunctions bsnsFction = new BusinessFunctions();
		bsnsFction.logot();
	}
	
}
