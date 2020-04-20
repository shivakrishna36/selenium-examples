package com.example.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	
	
	public static void main(String[] args) {

		try {
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
			driver.get("http://youtube.com");
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys("janani sivakamini song");
			driver.findElement(By.xpath("//ytd-searchbox[@role='search']/form/button")).click();
			driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
