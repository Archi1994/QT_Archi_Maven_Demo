package com.testNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		  WebDriverManager.chromedriver().setup();
	      
	      driver=new ChromeDriver();
	      driver.get("http://www.facebook.com");
	      driver.manage().window().maximize();
	}
	
  @Test
  public void f() {
	  
	  WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
      email.sendKeys("archanataneja@gmail.com");
      
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
