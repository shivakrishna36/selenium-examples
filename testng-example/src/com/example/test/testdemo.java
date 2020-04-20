package com.example.test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testdemo {

	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	}

	@Test
	public void test() {
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.get("http://youtube.com");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("janani sivakamini song");
		driver.findElement(By.xpath("//ytd-searchbox[@role='search']/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
		
	}
	
}
