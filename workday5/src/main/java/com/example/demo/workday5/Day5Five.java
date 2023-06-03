package com.example.demo.workday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5Five {
	public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://demo.smart-hospital.in/site/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
        WebElement ans=driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/form/div/input"));
        System.out.println(ans.getSize());
        System.out.println(ans.getCssValue("color"));
    }
}
