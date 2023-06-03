package sampletesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7Three {
	  WebDriver driver;
  @BeforeMethod
  public void openUrl() {
	  WebDriverManager.edgedriver().setup();
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  driver.navigate().to(url);
  }
  @Test
  public void UserDet() throws InterruptedException
  {
	  Thread.sleep(3000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
  }
  @AfterMethod
  public void aftermethod()
  {
	  driver.quit();
  }
}
