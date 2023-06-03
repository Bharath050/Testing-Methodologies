package com.example.demo.workday5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver(); 
        driver.get("https://j2store.net/free/");
        driver.manage().window().maximize();
        String actual=driver.getTitle();
        if(actual.equals("Home"))
        {
        	System.out.println(actual);
        }
        driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/a/img")).click();
        String b=driver.getTitle();
        if(b.equals("Shop"))
        {
        	System.out.println(b);
        }
    }
}
