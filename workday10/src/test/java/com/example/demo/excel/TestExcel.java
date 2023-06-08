package com.example.demo.excel;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestExcel {
  @Test(dataProvider = "testData")
  public void addMethod(double n1,double n2) throws IOException {
	  double res = n1+n2;
	  xlutility.updateExcel();
	  
  }
  @DataProvider
  public Object[][] testData() throws IOException
  {
	  Object[][] data = xlutility.readExcel();
	  return data;
  }
}
