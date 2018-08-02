package org.example.Tanmay;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Booking {
	WebDriver driver = WebDriverFactory.createDriver();
	@Test(dataProvider = "usernamepassword",description="testing login feature")
	public void login(String username, String password) {
		LoginPageObject.uname.clear();
		LoginPageObject.uname.sendKeys(username);
		LoginPageObject.pass.clear();
		LoginPageObject.pass.sendKeys(password);
		LoginPageObject.login_button.click();
		driver.navigate().back();


	}

	@DataProvider(name="usernamepassword")
	public String[][] credentials() {
		return new String[][] {
			new String[] { "invalidUN", "invalidPW" },
			new String[] { "aaaaa", "bbbba" },
		};
	}
	@BeforeTest
	public void beforeTest() {

		driver.manage().window() .maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://newtours.demoaut.com/");
		PageFactory.initElements(driver, LoginPageObject.class);
	}

	@AfterTest
	public void afterTest() {
	}

}
