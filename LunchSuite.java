import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LunchSuite {

	private final String baseUrl = "https://www.google.com/";
	private WebDriver driver = null;


	@BeforeClass
	public static void onStart() {
		System.err.println( "LunchSuite started on " + new Date() );
		System.setProperty( "webdriver.chrome.driver", System.getProperty( "user.dir" )
				+ "\\testing\\res\\webdriver\\chromedriver.exe" );
	}


	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get( baseUrl );
	}


	@Test
	public void getTitleTest() {
		Assert.assertEquals( "Google", driver.getTitle() );
	}


	@Test
	public void navigateToYahooTest() {
		driver.get( "https://www.yahoo.com" );
		Assert.assertEquals( "Yahoo", driver.getTitle() );
	}


	@After
	public void tearDown() {
		driver.quit();
	}


	@AfterClass
	public static void onFinish() {
		System.err.println( "LunchSuite ended on " + new Date() );
	}

}
