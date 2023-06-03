package com.example.demo.workDay8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8two { 
	public static void main(String args[])
	{
		System.out.print("Hello World!");
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://demoqa.com/droppable/");
	    driver.manage().window().maximize();
	    WebElement drg = driver.findElement(By.id("draggable"));
	    WebElement drp = driver.findElement(By.id("droppable"));
	    Actions ac=new Actions(driver);
	    ac.clickAndHold(drg).release(drp).build().perform();
	}
}
