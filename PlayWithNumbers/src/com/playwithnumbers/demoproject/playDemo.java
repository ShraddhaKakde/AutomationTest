package com.playwithnumbers.demoproject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.playwithnumber.genlibrary.Driver;
import com.playwithnumber.genlibrary.constants;


public class playDemo {
	@Test

	public void playdemo() throws InterruptedException {
		// TODO Auto-generated method stub
		boolean flag=true;
		Driver.getBrowser();
		Driver.driver.get(constants.url);
		for(int i=0;i<=3;i++)
		{

		System.out.println("------------------------------");
		System.out.println(constants.enternumber[i]);
		Driver.driver.findElement(By.cssSelector("input#number")).clear();
		Thread.sleep(1000);
		Driver.driver.findElement(By.cssSelector("input#number")).sendKeys(constants.enternumber[i]);
		Thread.sleep(1000);
		Driver.driver.findElement(By.cssSelector("input#checkButton")).click();
		Thread.sleep(5000);
		
		try
		{
			if(Driver.driver.findElement(By.xpath("//p[text()='Number is even']")).isDisplayed())
			{
//				flag=false;
				System.out.println("Number is even");
			}
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		
		try
		{
			if(Driver.driver.findElement(By.xpath("//p[text()='Number is odd']")).isDisplayed())
			{
//				flag=false;
				System.out.println("Number is odd");
			}
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		try
		{
			if(Driver.driver.findElement(By.xpath("//p[text()='Number is Armstrong']")).isDisplayed())
			{
//				flag=false;
				System.out.println("Number is Armstrong");
			}
		
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		try
		{
			if(Driver.driver.findElement(By.xpath("//p[text()='Number is not Armstrong']")).isDisplayed())
			{
//				flag=false;
				System.out.println("Number is not Armstrong");
			}
		
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		
		try
		{
			if(Driver.driver.findElement(By.xpath("//p[text()='Number is not Palindrome']")).isDisplayed())
			{
//				flag=false;
				System.out.println("Number is not Palindrome");
			}
		
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		try
		{
			if(Driver.driver.findElement(By.xpath("//p[text()='Number is Palindrome']")).isDisplayed())
			{
//				flag=false;
				System.out.println("Number is Palindrome");
			}
		
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		try
		{
			if(Driver.driver.findElement(By.cssSelector("p#factorRes")).isDisplayed())
			{
				String pageText = Driver.driver.findElement(By.cssSelector("p#factorRes")).getText();
				System.out.println("factor of given number is"+pageText);
			}
		}
		catch(Exception e)
		{
			//System.out.println("ok");
		}
		
	}
			Driver.driver.quit();
	}

	}
