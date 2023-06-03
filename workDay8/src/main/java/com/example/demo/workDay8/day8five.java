package com.example.demo.workDay8;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8five {
	public static void main(String args[]) {
		System.out.print("Hello World!");
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    WebElement search = driver.findElement(By.name("q"));
	    search.sendKeys("Apple");
	    search.sendKeys(Keys.ENTER);
	    String t1=driver.getTitle();
	    String id1=driver.getWindowHandle();
	    System.out.println(t1);
	    System.out.println(id1);
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    
	    
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    WebElement search1 = driver.findElement(By.name("q"));
	    search1.sendKeys("selenium");
	    search1.sendKeys(Keys.ENTER);
	    String t2=driver.getTitle();
	    String id2=driver.getWindowHandle();
	    System.out.println(t2);
	    System.out.println(id2);
	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    
	    
	    driver.get("https://www.google.com/");
	    driver.manage().window().maximize();
	    WebElement search2 = driver.findElement(By.name("q"));
	    search2.sendKeys("cucumber");
	    search2.sendKeys(Keys.ENTER);
	    String t3=driver.getTitle();
	    String id3=driver.getWindowHandle();
	    System.out.println(t3);
	    System.out.println(id3);
//	    driver.switchTo().newWindow(WindowType.TAB);
	    
	    
	    
	    Set<String> total=driver.getWindowHandles();
	    System.out.println("Total tabs"+total.size());
	    
	}
}
