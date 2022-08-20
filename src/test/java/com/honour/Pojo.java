package com.honour;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Pojo {
	WebDriver driver;
	WebDriverWait wait;

	public Pojo(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath("//input[@id='login-email']");
	By password = By.xpath("//input[@id='login-password']");
	By login = By.className("btn btn-primary waves-effect waves-float waves-light");

	private void username() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(username)).sendKeys("admin@admin.com");
	}

	private void password() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys("password");
	}

	private void login() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(login)).click();
	}

	public void loginPage() {
		this.username();
		this.password();
		this.login();
	}
}
