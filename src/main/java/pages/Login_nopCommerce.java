package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login_nopCommerce {
	public WebDriver driver;
	By emailid = new By.ById("Email");
	By password = new By.ById("Password");
	By btnlogin = new By.ByXPath("//button[@type='submit']");
	By logout = new By.ByLinkText("Logout");

	public Login_nopCommerce(WebDriver driver) {
		this.driver = driver;
	}

	public void login_page() throws InterruptedException {
		driver.findElement(emailid).clear();
		driver.findElement(emailid).sendKeys("admin@yourstore.com");
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys("admin");
		driver.findElement(btnlogin).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
		Assert.assertEquals(title, "Dashboard / nopCommerce administration", "Title matches");
		
		driver.findElement(logout).click();
		
		Assert.assertEquals(title, "Dashboard / nopCommerce administration", "Title does not match");
	}
	
	public void close_browser() {
		driver.quit();
	}
}
