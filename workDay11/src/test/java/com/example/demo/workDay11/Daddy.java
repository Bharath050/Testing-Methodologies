package com.example.demo.workDay11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Daddy {
	ExtentSparkReporter spark;
	static ExtentReports extent;
	static ExtentTest test;
	@BeforeClass
	public void starttest() {
		spark = new ExtentSparkReporter("report.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	
  WebDriver driver;
  @Test(groups = "SmokeTest")
  public void TestCase01() throws Exception{
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle, "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  String actualUrl = driver.getCurrentUrl();
	  Assert.assertEquals(actualUrl,"https://www.godaddy.com/en-in");
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/button")).click();
	  driver.close();
	  test = extent.createTest("Test Case 2","Test Case 2 has Passed");
  }
  @AfterMethod
  public void getresult(ITestResult result) {
	  if(result.getStatus()==ITestResult.FAILURE)
	  {
		  test.log(Status.FAIL,result.getThrowable());
	  }
	  else if(result.getStatus()==ITestResult.SUCCESS)
	  {
		  test.log(Status.PASS,result.getTestName());
	  }else
	  {
		  test.log(Status.SKIP,result.getTestName());		  
	  }
  }
	  @AfterTest
	  public void save() {
		  extent.flush();
	  
  }
  
}