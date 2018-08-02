package org.example.Tanmay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {


	public static WebDriver createDriver() {
		String webdriver = System.getProperty("browser","ie");

		switch (webdriver) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Driver\\chromedriver.exe");
			return new ChromeDriver();
		case "firefox":
			System.setProperty("webdriver.gecko.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Driver\\geckodriver.exe");	
			return new FirefoxDriver();
		case "ie":
			System.setProperty("webdriver.ie.driver","C:\\Users\\pdc4-training.pdc4\\Desktop\\Driver\\IEDriverServer.exe");
			return new InternetExplorerDriver();
		default:
			throw new RuntimeException("Unsupported webdriver: " + webdriver);
		}
	}

}




