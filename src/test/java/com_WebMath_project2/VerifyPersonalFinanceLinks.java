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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class VerifyPersonalFinanceLinks {
	WebDriver driver;
	FileReader reader;
	Properties props;
	 @Test 
	  public void verifySimpleInterestLinkWithValidInput() {
		 String SimpleInterest_link =props.getProperty("SimpleInterest_link_loc");
		  String SiPrincipalAmount =props.getProperty("SiPrincipalAmount_loc");
		  String ValidSiAmount =props.getProperty("ValidSiAmount");
		  String SiInterestRate =props.getProperty("SiInterestRate_loc");
		  String ValidSiInterestRate =props.getProperty("ValidSiInterestRate");
		  String CiCompoundYear =props.getProperty("CiCompoundYear_loc");
		  String ValidCiCompoundYear =props.getProperty("ValidCiCompoundYear");
		  String CiDesiredTime =props.getProperty("CiDesiredTime_loc");
		  String ValidCiDesiredTime =props.getProperty("ValidCiDesiredTime");
		  String FindCiAmountButton =props.getProperty("FindAmountButton_loc");
		  driver.findElement(By.linkText(SimpleInterest_link)).click();
		driver.findElement(By.name(SiPrincipalAmount)).sendKeys(ValidSiAmount);
		driver.findElement(By.name(SiInterestRate)).sendKeys(ValidSiInterestRate);
		driver.findElement(By.name(CiCompoundYear)).sendKeys(ValidCiCompoundYear);
		driver.findElement(By.name(CiDesiredTime)).sendKeys(ValidCiDesiredTime);
		driver.findElement(By.xpath(FindCiAmountButton)).click();
		  
	  }
	 @Test 
	  public void verifyCompoundInterestLinkWithValidInput() {
		  String CompoundInterest_link =props.getProperty("CompoundInterest_link_loc");	 
		  String CiPrincipalAmount =props.getProperty("CiPrincipalAmount_loc");
		  String ValidCiAmount =props.getProperty("ValidCiAmount");
		  String CiInterestRate =props.getProperty("CiInterestRate_loc");
		  String ValidCiInterestRate =props.getProperty("ValidCiInterestRate");
		  String CiCompoundYear =props.getProperty("CiCompoundYear_loc");
		  String ValidCiCompoundYear =props.getProperty("ValidCiCompoundYear");
		  String CiDesiredTime =props.getProperty("CiDesiredTime_loc");
		  String ValidCiDesiredTime =props.getProperty("ValidCiDesiredTime");
		  String FindCiAmountButton =props.getProperty("FindAmountButton_loc");
		driver.findElement(By.linkText(CompoundInterest_link)).click();
		driver.findElement(By.name(CiPrincipalAmount)).sendKeys(ValidCiAmount);
		driver.findElement(By.name(CiInterestRate)).sendKeys(ValidCiInterestRate);
		driver.findElement(By.name(CiCompoundYear)).sendKeys(ValidCiCompoundYear);
		driver.findElement(By.name(CiDesiredTime)).sendKeys(ValidCiDesiredTime);
		driver.findElement(By.xpath(FindCiAmountButton)).click();
		  
	  }
	 @Test 
	  public void verifyCompoundInterestLinkWithInvalidInput() {
		  String CompoundInterest_link =props.getProperty("CompoundInterest_link_loc");
		  String CiPrincipalAmount =props.getProperty("CiPrincipalAmount_loc");
		  String InvalidCiAmount =props.getProperty("InvalidCiAmount");
		  String CiInterestRate =props.getProperty("CiInterestRate_loc");
		  String InvalidCiInterestRate =props.getProperty("InvalidCiInterestRate");
		  String CiCompoundYear =props.getProperty("CiCompoundYear_loc");
		  String InvalidCiCompoundYear =props.getProperty("InvalidCiCompoundYear");
		  String CiDesiredTime =props.getProperty("CiDesiredTime_loc");
		  String InvalidCiDesiredTime =props.getProperty("InvalidCiDesiredTime");
		  String FindCiAmountButton =props.getProperty("FindAmountButton_loc");
		driver.findElement(By.linkText(CompoundInterest_link)).click();
		driver.findElement(By.name(CiPrincipalAmount)).sendKeys(InvalidCiAmount);
		driver.findElement(By.name(CiInterestRate)).sendKeys(InvalidCiInterestRate);
		driver.findElement(By.name(CiCompoundYear)).sendKeys(InvalidCiCompoundYear);
		driver.findElement(By.name(CiDesiredTime)).sendKeys(InvalidCiDesiredTime);
		driver.findElement(By.xpath(FindCiAmountButton)).click();
		  
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
			reader=new FileReader("D:\\old laptop programs\\eclipse-workspace old\\ExcelR\\ExcelR_Training\\com_WebMath_project2\\src\\main\\resources\\config\\MathForEveryone.properties");
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
	      String MathForEveryone_Tab =props.getProperty("MathForEveryone_Tab_link");  
	      driver.get(url);
	      driver.findElement(By.linkText(MathForEveryone_Tab)).click();
	    
		
  }

  @AfterMethod
  public void afterMethod() {
  }

}
