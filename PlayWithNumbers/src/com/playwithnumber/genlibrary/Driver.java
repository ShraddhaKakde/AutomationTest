package com.playwithnumber.genlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {

	public static WebDriver driver;
	public static WebDriver getBrowser()
	{
		if(constants.browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","D:\\Shraddha\\Software\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}else
		if(constants.browser.equals("chrome"))
		{
				System.setProperty("webdriver.chrome.driver","D:\\Shraddha\\Software\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}else
			if(constants.browser.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","D:\\Shraddha\\Software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
				driver = new FirefoxDriver();
			}		
		return driver;
	}
}
