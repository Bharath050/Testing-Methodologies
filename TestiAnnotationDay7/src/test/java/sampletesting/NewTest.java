package sampletesting;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void day7() {
	  WebDriverManager.edgedriver().setup();
	  WebDriver driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.navigate().to("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual,"Guest Registration Form – User Registration");
	  
  }
}
