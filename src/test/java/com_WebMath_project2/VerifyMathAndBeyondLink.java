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

public class VerifyMathAndBeyondLink {
	WebDriver driver;
	FileReader reader;
	Properties props;
  @Test
  public void verifyWeightOnAnotherPlanetLinkWithValidData() {
	  String WeightOnAnotherPlanet_link =props.getProperty("WeightOnAnotherPlanet_link_loc"); 
	  String Weight_loc =props.getProperty("Weight_loc"); 
	  String ValidWeight =props.getProperty("ValidWeight"); 
	  String Planet_loc =props.getProperty("Planet_loc");
	  String Planet_option =props.getProperty("Planet_option"); 
	  String HowMuchWouldIWeighButton =props.getProperty("HowMuchWouldIWeighButton_loc");
	  driver.findElement(By.linkText(WeightOnAnotherPlanet_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Weight_loc)).sendKeys(ValidWeight);
	  WebElement par1=  driver.findElement(By.name(Planet_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(Planet_option);
	  driver.findElement(By.xpath(HowMuchWouldIWeighButton)).click();	  	
	  
  }
  @Test
  public void verifyWeightOnAnotherPlanetLinkWithInvalidData() {
	  String WeightOnAnotherPlanet_link =props.getProperty("WeightOnAnotherPlanet_link_loc"); 
	  String Weight_loc =props.getProperty("Weight_loc"); 
	  String InvalidWeight =props.getProperty("InvalidWeight"); 
	  String Planet_loc =props.getProperty("Planet_loc");
	  String Planet_option =props.getProperty("Planet_option"); 
	  String HowMuchWouldIWeighButton =props.getProperty("HowMuchWouldIWeighButton_loc");
	  driver.findElement(By.linkText(WeightOnAnotherPlanet_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Weight_loc)).sendKeys(InvalidWeight);
	  WebElement par1=  driver.findElement(By.name(Planet_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(Planet_option);
	  driver.findElement(By.xpath(HowMuchWouldIWeighButton)).click();	  	
	  
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
