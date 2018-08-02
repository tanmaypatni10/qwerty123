package org.example.Tanmay;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Login {
	//private static final String Timeunits = null;
	private WebDriver driver;
	@Test(priority=1)
	public void register() throws InterruptedException {

		driver.findElement(By.linkText("REGISTER")).click();
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("firstName")));
		Thread.sleep(6000);
		driver.findElement(By.name("firstName")).sendKeys("Indrayani");
		driver.findElement(By.name("lastName")).sendKeys("Singare");
		driver.findElement(By.name("phone")).sendKeys("123654478");
		driver.findElement(By.id("userName")).sendKeys("indudethe@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("kumathe");
		driver.findElement(By.name("city")).sendKeys("solapur");

		Select country = new Select(driver.findElement(By.name("country")));
		country.selectByValue("92");

		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("indumandhu");
		driver.findElement(By.name("password")).sendKeys("Indu@123");
		driver.findElement(By.name("confirmPassword")).sendKeys("Indu@123");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.partialLinkText("sign")).click();


		/*    @Test(description="This test case ")
	        public void login()
	        {
		    	LoginPageObject.uname.clear();
		    	LoginPageObject.uname.sendkeys("invalidUN");
		    	LoginPageObject.pass.clear();
		    	LoginPageObject.pass.sendkeys("invalidPW");*/



	}

	@BeforeTest
	public void beforeTest() {
		driver=WebDriverFactory.createDriver();


		driver.manage().window() .maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com/");          
	}

	//		@Test (priority=2)
	//		public void login() {
	//			driver.findElement(By.name("userName")).clear();
	//		    driver.findElement(By.name("userName")).sendKeys("indumandhu");
	//			driver.findElement(By.name("password")).clear();
	//			driver.findElement(By.name("password")).sendKeys("Indu@123");
	//			driver.findElement(By.name("login")).click();
	//			Assert.assertEquals("find a flight", driver.getTitle());
	//			
	//		}
	@AfterTest
	public void afterTest() {

		//driver.close();
	}

}

