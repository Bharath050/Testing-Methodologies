package com.example.demo.workDay8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class day8three {
	public static void main(String args[]) throws InterruptedException
	{
		System.out.print("Hello World!");
		WebDriverManager.edgedriver().setup();
	    WebDriver driver = new EdgeDriver();
	    driver.get("https://demo.guru99.com/test/delete_customer.php");
	    driver.manage().window().maximize();
	    WebElement value=driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input"));
	    value.sendKeys("401");
	    WebElement submit=driver.findElement(By.name("submit"));
	    submit.click();
//	    for alert box and to cancel dismis
	    Alert alert=driver.switchTo().alert();
	    alert.dismiss();
	    Thread.sleep(5000);
	    value.clear();
	    value.sendKeys("402");
	    submit.click();
	    alert.accept();
	    System.out.println(alert.getText());
	    
	    

	    
	}
}
