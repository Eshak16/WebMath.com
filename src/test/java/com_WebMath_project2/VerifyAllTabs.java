package com_WebMath_project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

public class VerifyAllTabs {
	WebDriver driver;
	FileReader reader;
	Properties props;
  @Test
  public void verifyMathForEveryoneTab() {
	  String MathForEveryone_Tab =props.getProperty("MathForEveryone_Tab_link");  
      driver.findElement(By.linkText(MathForEveryone_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @Test
  public void verifyGeneralMathTab() {
	  String GeneralMath_Tab =props.getProperty("GeneralMath_Tab_link");  
      driver.findElement(By.linkText(GeneralMath_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @Test
  public void verifyK8MathTab() {
	  String K8Math_Tab =props.getProperty("K-8Math_Tab_link");  
      driver.findElement(By.linkText(K8Math_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @Test
  public void verifyAlgebraTab() {
	  String Algebra_Tab =props.getProperty("Algebra_Tab_link");  
      driver.findElement(By.linkText(Algebra_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @Test
  public void verifyPlotsGeometryTab() {
	  String PlotsGeometry_Tab =props.getProperty("Plots&Geometry_Tab_link");  
      driver.findElement(By.linkText(PlotsGeometry_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @Test
  public void verifyTrigCalculusTab() {
	  String TrigCalculus_Tab =props.getProperty("Trig.&Calculus_Tab_link");  
      driver.findElement(By.linkText(TrigCalculus_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @Test
  public void verifyOtherStuffTab() {
	  String OtherStuff_Tab =props.getProperty("OtherStuff_Tab_link");  
      driver.findElement(By.linkText(OtherStuff_Tab)).click();
      System.out.println(driver.getTitle());
    
  }
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "D:\\old laptop programs\\selenium jars\\browser\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
	    co.addArguments("--remote-allow-origins=*");
    driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		try {
			reader=new FileReader("D:\\old laptop programs\\eclipse-workspace old\\ExcelR\\ExcelR_Training\\com_WebMath_project2\\src\\main\\resources\\config\\Homepage.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     props=new Properties();
	      try {
			props.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      String url =props.getProperty("mainURL");  
	      driver.get(url);
	    
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
