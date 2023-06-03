package sampletesting;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Calculate{
	int num1= 200;
	int num2=100;
  @Test(priority=1)
  public void Addition() {
	  int sum =num1+num2;
	 Assert.assertEquals(sum, 300);
	  
  }
  @Test(priority=2)
  public void Subtraction() {
	  int diff =num1-num2;
	  Assert.assertEquals(diff,100);
	  
  }
  @Test(priority=3)
  public void Multiplication() {
	  int mul =num1*num2;
	  Assert.assertEquals(mul,20000);
	  
  }
  @Test(priority=4)
  public void Division() {
	  int div =num1/num2;
	  Assert.assertEquals(div,2);
	  
  }
}
