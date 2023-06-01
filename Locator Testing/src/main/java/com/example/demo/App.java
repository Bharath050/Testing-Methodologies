package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.manage().window().fullscreen();
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
    	driver.findElement(By.name("search")).sendKeys("mobiles");    	
    	driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Bharath");
    	driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("tharun");
    	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("tharunbharath05@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("passo");
    	js.executeScript("window.scrollBy(0,2000)", "");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
    	driver.findElement(By.linkText("Returns")).click();
    	driver.navigate().back();
    	WebElement k = driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a"));
    	k.click();
    	driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Bharath");
    	driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("recipitient@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Tharun");
    	driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("tharunbharath05@gmail.com");
    	driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
    	driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Many More Happy Returns of The Day");
    	js.executeScript("window.scrollBy(0,2000)", "");
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
//    	driver.findElement(By.linkText("Continue")).click();
    	

    }
}
