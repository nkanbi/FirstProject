
	import static org.junit.Assert.*;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;

	import org.junit.Test;

	//This test will not work if you do not have Junit Library and Chromedriver from:
	// https://sites.google.com/a/chromium.org/chromedriver/
	
	public class ChromeURL {

	@Test public void site_header_is_on_home_page() {   

	WebDriver browser;   



	//Chrome driver requires you to specify its location

	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	browser =new ChromeDriver();   

	browser.navigate().to("http://saucelabs.com");


	WebElement header = browser.findElement(By.id("site-header"));   

	assertTrue((header.isDisplayed()));   

	browser.close();

	}

	}
	

