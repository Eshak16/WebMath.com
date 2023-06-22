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

public class VerifyUnitsConversionLinks {
	WebDriver driver;
	FileReader reader;
	Properties props;
  @Test
  public void verifyLengthLinkWithValidData() {
	  String Length_link =props.getProperty("Length_link_loc"); 
	  String Lenght_loc =props.getProperty("param0_loc"); 
	  String ValidLenght =props.getProperty("ValidParam0"); 
	  String param1_loc =props.getProperty("param1_loc"); 
	  String param1_option =props.getProperty("param1_option"); 
	  String param2_loc =props.getProperty("param2_loc"); 
	  String param2_option =props.getProperty("param2_option"); 
	  String ConvertButton =props.getProperty("ConvertButton_loc");
	  driver.findElement(By.linkText(Length_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Lenght_loc)).sendKeys(ValidLenght);
	  WebElement par1=  driver.findElement(By.name(param1_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(param1_option);
	  WebElement par2=  driver.findElement(By.name(param2_loc));
	  Select sel2=new Select(par2);
	  sel2.selectByVisibleText(param2_option);
	  driver.findElement(By.xpath(ConvertButton)).click();	  	
	  
  }
  @Test
  public void verifyLengthLinkWithInvalidData() {
	  String Length_link =props.getProperty("Length_link_loc"); 
	  String Number_loc =props.getProperty("param0_loc"); 
	  String InvalidNumber =props.getProperty("InvalidParam0"); 
	  String param1_loc =props.getProperty("param1_loc"); 
	  String param1_option =props.getProperty("param1_option"); 
	  String param2_loc =props.getProperty("param2_loc"); 
	  String param2_option =props.getProperty("param2_option"); 
	  String ConvertButton =props.getProperty("ConvertButton_loc");
	  driver.findElement(By.linkText(Length_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Number_loc)).sendKeys(InvalidNumber);
	  WebElement par1=  driver.findElement(By.name(param1_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(param1_option);
	  WebElement par2=  driver.findElement(By.name(param2_loc));
	  Select sel2=new Select(par2);
	  sel2.selectByVisibleText(param2_option);
	  driver.findElement(By.xpath(ConvertButton)).click();	  	
	  
  }
  @Test
  public void verifyMassLinkWithValidData() {
	  String Mass_link =props.getProperty("mass_link_loc"); 
	  String Mass_loc =props.getProperty("param0_loc"); 
	  String ValidMass =props.getProperty("ValidParam0"); 
	  String param1_loc =props.getProperty("param1_loc"); 
	  String param1_option =props.getProperty("param1_option"); 
	  String param2_loc =props.getProperty("param2_loc"); 
	  String param2_option =props.getProperty("param2_option"); 
	  String ConvertButton =props.getProperty("ConvertButton_loc");
	  driver.findElement(By.linkText(Mass_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Mass_loc)).sendKeys(ValidMass);
	  WebElement par1=  driver.findElement(By.name(param1_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(param1_option);
	  WebElement par2=  driver.findElement(By.name(param2_loc));
	  Select sel2=new Select(par2);
	  sel2.selectByVisibleText(param2_option);
	  driver.findElement(By.xpath(ConvertButton)).click();	  	
	  
  }
  @Test
  public void verifyMassLinkWithInvalidData() {
	  String Mass_link =props.getProperty("mass_link_loc"); 
	  String Mass_loc =props.getProperty("param0_loc"); 
	  String InvalidMass =props.getProperty("InvalidParam0"); 
	  String param1_loc =props.getProperty("param1_loc"); 
	  String param1_option =props.getProperty("param1_option"); 
	  String param2_loc =props.getProperty("param2_loc"); 
	  String param2_option =props.getProperty("param2_option"); 
	  String ConvertButton =props.getProperty("ConvertButton_loc");
	  driver.findElement(By.linkText(Mass_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Mass_loc)).sendKeys(InvalidMass);
	  WebElement par1=  driver.findElement(By.name(param1_loc));
	  Select sel1=new Select(par1);
	  sel1.selectByVisibleText(param1_option);
	  WebElement par2=  driver.findElement(By.name(param2_loc));
	  Select sel2=new Select(par2);
	  sel2.selectByVisibleText(param2_option);
	  driver.findElement(By.xpath(ConvertButton)).click();	  	
	  
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
