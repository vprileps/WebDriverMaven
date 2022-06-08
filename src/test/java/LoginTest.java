import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest
{
	public static WebDriver driver;

	@BeforeTest
	public void setUp()
	{
		driver = WebDriverManager.chromedriver().create();

	}

	@Test
	public void doLogin()
	{
		driver.get("https://www.google.com/");
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
