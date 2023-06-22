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

public class VerifyMathHomeLink {
	WebDriver driver;
	FileReader reader;
	Properties props;
  @Test
  public void verifyCostOfElectricityLinkWithValidData() {
	  String CostOfElectricity_link =props.getProperty("CostOfElectricity_link_loc"); 
	  String Watts_loc =props.getProperty("Watts_loc"); 
	  String ValidWatts =props.getProperty("ValidWatts"); 
	  String Time_loc =props.getProperty("Time_loc"); 
	  String ValidTime =props.getProperty("ValidTime"); 
	  String TimeUnit_loc =props.getProperty("TimeUnit_loc");
	  String TimeUnit_option =props.getProperty("TimeUnit_option"); 
	  String Cost_loc =props.getProperty("Cost_loc"); 
	  String ValidCost =props.getProperty("ValidCost"); 
	  String HowmuchButton =props.getProperty("HowmuchButton_loc");
	  driver.findElement(By.linkText(CostOfElectricity_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Watts_loc)).sendKeys(ValidWatts);
	  driver.findElement(By.name(Time_loc)).sendKeys(ValidTime);
	  WebElement par1=  driver.findElement(By.name(TimeUnit_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(TimeUnit_option);
	  driver.findElement(By.name(Cost_loc)).clear();
	  driver.findElement(By.name(Cost_loc)).sendKeys(ValidCost);
	  driver.findElement(By.xpath(HowmuchButton)).click();	  	
	  
  }
  @Test
  public void verifyCostOfElectricityLinkWithInvalidData() {
	  String CostOfElectricity_link =props.getProperty("CostOfElectricity_link_loc"); 
	  String Watts_loc =props.getProperty("Watts_loc"); 
	  String InvalidWatts =props.getProperty("InvalidWatts"); 
	  String Time_loc =props.getProperty("Time_loc"); 
	  String InvalidTime =props.getProperty("InvalidTime"); 
	  String TimeUnit_loc =props.getProperty("TimeUnit_loc");
	  String TimeUnit_option =props.getProperty("TimeUnit_option"); 
	  String Cost_loc =props.getProperty("Cost_loc"); 
	  String InvalidCost =props.getProperty("InvalidCost"); 
	  String HowmuchButton =props.getProperty("HowmuchButton_loc");
	  driver.findElement(By.linkText(CostOfElectricity_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Watts_loc)).sendKeys(InvalidWatts);
	  driver.findElement(By.name(Time_loc)).sendKeys(InvalidTime);
	  WebElement par1=  driver.findElement(By.name(TimeUnit_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(TimeUnit_option);
	  driver.findElement(By.name(Cost_loc)).clear();
	  driver.findElement(By.name(Cost_loc)).sendKeys(InvalidCost);
	  driver.findElement(By.xpath(HowmuchButton)).click();	  	
	  
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
