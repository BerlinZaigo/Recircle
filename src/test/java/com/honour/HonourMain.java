package com.honour;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HonourMain {

	WebDriver driver;

	@BeforeClass
	private void launchDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://3.223.85.137/honor-contracting/public/");
		driver.manage().window().maximize();
	}

	@Test
	private void login() {
		Pojo pojo = new Pojo(driver);
		pojo.loginPage();
	}
}
