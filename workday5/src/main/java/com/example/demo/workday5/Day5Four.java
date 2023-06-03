package com.example.demo.workday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Four {
	 public static void main( String[] args )
	    {
	    	WebDriverManager.edgedriver().setup();
	        WebDriver driver = new EdgeDriver(); 
	        driver.get("https://j2store.net/free/");
	        driver.manage().window().maximize();
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"t3-header\"]/div/div/div[2]/div[2]/ul/li[1]/a")).click();
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
	    }
}
