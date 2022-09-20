package nopCommerce;

import org.testng.annotations.Test;

import pages.Login_nopCommerce;

public class TC_01_login_nopCommerce extends BaseClass_nopCommerce{
	
	@Test
	public void login_page_nonCommerce() throws InterruptedException {
		Login_nopCommerce lp = new Login_nopCommerce(driver);
		lp.login_page();
		lp.close_browser();
		
			
	}

}
