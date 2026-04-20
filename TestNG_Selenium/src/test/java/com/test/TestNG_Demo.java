package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class TestNG_Demo {
	WebDriver driver;
	

  @Test
  public void login() {
	  driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys("anandkumar@gmail.com");
	  driver.findElement(By.id("loginpassword")).sendKeys("Anandkumar@123");
	  driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
	  String value = driver.findElement(By.id("nameofuser")).getText();
	  Assert.assertTrue(value.contains("Welcome"));
	  System.out.println("Login Successful");
  }
  
  @Test
  public void loginPasswordInvalid() {
	  driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	  driver.findElement(By.id("loginusername")).sendKeys("anandkumar@gmail.com");
	  driver.findElement(By.id("loginpassword")).sendKeys("Anandkumar@124");
	  driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert = driver.switchTo().alert();
	  String value = "Wrong password.";
	  
	  wait.until(ExpectedConditions.alertIsPresent());
	  Assert.assertEquals(alert.getText(),value);
	  alert.accept();
  }
  
  @Test
  public void loginUsernameInvalid() {
	  driver.findElement(By.xpath("//*[@id=\"login2\"]")).click();
	  driver.findElement(By.id("loginusername")).sendKeys("anandumar@gmail.com");
	  driver.findElement(By.id("loginpassword")).sendKeys("Anandkumar@123");
	  driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.alertIsPresent());
	  Alert alert = driver.switchTo().alert();
	  String value = "User does not exist.";
	  
	  wait.until(ExpectedConditions.alertIsPresent());
	  Assert.assertEquals(alert.getText(),value);
	  alert.accept();
  }
  @BeforeMethod
  public void beforeMethod() {
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("--start-maximized");
	  //options.addArguments("--lang=ta");
	  driver = new ChromeDriver(options);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://www.demoblaze.com/");
	  
  }
  @AfterMethod(groups = "groupB")
  public void AfterMethod() {
	 driver.quit();
	 
  }
 

}
