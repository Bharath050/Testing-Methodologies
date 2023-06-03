package com.example.demo.workday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Three {
	public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[1]/div/div[1]/div/a/img")).getCssValue("title"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[2]/div/div[1]/div/a/img")).getCssValue("title"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[1]/div[3]/div/div[1]/div/a/img")).getCssValue("title"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[2]/div[1]/div/div[1]/div/a/img")).getCssValue("title"));
        System.out.println(driver.findElement(By.xpath("//*[@id=\"akeeba-renderjoomla\"]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/a/img")).getCssValue("title"));

        
    }
}
