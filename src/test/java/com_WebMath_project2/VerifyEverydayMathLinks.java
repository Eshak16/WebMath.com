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

public class VerifyEverydayMathLinks {
	WebDriver driver;
	FileReader reader;
	Properties props;
	@Test
	  public void verifyHelpTypingInYourMathProblemsLink() {
		  String HelpInMathProblem_link =props.getProperty("HelpInMathProblem_link_loc");  
		  driver.findElement(By.linkText(HelpInMathProblem_link)).click();
		  System.out.println(driver.getTitle());
		  
	  }
  @Test
  public void verifyFiguringATipLinkWithValidData() {
	  String FiguringATip_link =props.getProperty("FiguringATip_link_loc"); 
	  String tipAmount_loc =props.getProperty("param0_loc"); 
	  String ValidtipAmount =props.getProperty("ValidParam0"); 
	  String Cost_loc =props.getProperty("param1_loc"); 
	  String ValidCost =props.getProperty("Validparam1"); 
	  String Answer =props.getProperty("Answer_loc"); 
	  String FiguretipButton =props.getProperty("FiguretipButton_loc");
	  driver.findElement(By.linkText(FiguringATip_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(tipAmount_loc)).clear();
	  driver.findElement(By.name(tipAmount_loc)).sendKeys(ValidtipAmount);
	  driver.findElement(By.name(Cost_loc)).sendKeys(ValidCost);
	  driver.findElement(By.xpath(FiguretipButton)).click();	  	
	  
  }
  @Test
  public void verifyFiguringATipLinkWithInvalidData() {
	  String FiguringATip_link =props.getProperty("FiguringATip_link_loc"); 
	  String tipAmount_loc =props.getProperty("param0_loc"); 
	  String InvalidtipAmount =props.getProperty("InvalidParam0"); 
	  String Cost_loc =props.getProperty("param1_loc"); 
	  String InvalidCost =props.getProperty("Invalidparam1"); 
	  String Answer =props.getProperty("Answer_loc"); 
	  String FiguretipButton =props.getProperty("FiguretipButton_loc");
	  driver.findElement(By.linkText(FiguringATip_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(tipAmount_loc)).clear();
	  driver.findElement(By.name(tipAmount_loc)).sendKeys(InvalidtipAmount);
	  driver.findElement(By.name(Cost_loc)).sendKeys(InvalidCost);
	  driver.findElement(By.xpath(FiguretipButton)).click();	 
	  
  }
  @Test
  public void verifySalePriceLinkWithValidData() {
	  String SalePrice_link =props.getProperty("SalePrice_link_loc"); 
	  String OriginaCost_loc =props.getProperty("param0_loc"); 
	  String ValidOriginaCost=props.getProperty("ValidParam0"); 
	  String Percent_loc =props.getProperty("param1_loc"); 
	  String ValidPercent =props.getProperty("Validparam1"); 
	  String FigureCostButton =props.getProperty("FigureCostButton_loc");
	  driver.findElement(By.linkText(SalePrice_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(OriginaCost_loc)).clear();
	  driver.findElement(By.name(OriginaCost_loc)).sendKeys(ValidOriginaCost);
	  driver.findElement(By.name(Percent_loc)).sendKeys(ValidPercent);
	  driver.findElement(By.xpath(FigureCostButton)).click();	  	

  }
  @Test
  public void verifySalePriceLinkWithInvalidData() {
	  String SalePrice_link =props.getProperty("SalePrice_link_loc"); 
	  String OriginaCost_loc =props.getProperty("param0_loc"); 
	  String InvalidOriginaCost=props.getProperty("InvalidParam0"); 
	  String Percent_loc =props.getProperty("param1_loc"); 
	  String InvalidPercent =props.getProperty("Invalidparam1"); 
	  String FigureCostButton =props.getProperty("FigureCostButton_loc");
	  driver.findElement(By.linkText(SalePrice_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(OriginaCost_loc)).clear();
	  driver.findElement(By.name(OriginaCost_loc)).sendKeys(InvalidOriginaCost);
	  driver.findElement(By.name(Percent_loc)).sendKeys(InvalidPercent);
	  driver.findElement(By.xpath(FigureCostButton)).click();	  	

  }
  @Test
  public void verifyWindChillLinkWithValidData() {
	  String WindChill_link =props.getProperty("WindChill_link_loc"); 
	  String Temperature_loc =props.getProperty("param0_loc"); 
	  String ValidTemperature=props.getProperty("ValidParam0"); 
	  String Speed_loc =props.getProperty("param1_loc"); 
	  String ValidSpeed =props.getProperty("Validparam1"); 
	  String HowColdDoesItFeelButton =props.getProperty("HowColdDoesItFeelButton_loc");
	  driver.findElement(By.linkText(WindChill_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Temperature_loc)).clear();
	  driver.findElement(By.name(Temperature_loc)).sendKeys(ValidTemperature);
	  driver.findElement(By.name(Speed_loc)).sendKeys(ValidSpeed);
	  driver.findElement(By.xpath(HowColdDoesItFeelButton)).click();	  	

  }
  @Test
  public void verifyWindChillLinkWithInvalidData() {
	  String WindChill_link =props.getProperty("WindChill_link_loc"); 
	  String Temperature_loc =props.getProperty("param0_loc"); 
	  String InvalidTemperature=props.getProperty("InvalidParam0"); 
	  String Speed_loc =props.getProperty("param1_loc"); 
	  String InvalidSpeed =props.getProperty("Invalidparam1"); 
	  String HowColdDoesItFeelButton =props.getProperty("HowColdDoesItFeelButton_loc");
	  driver.findElement(By.linkText(WindChill_link)).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By.name(Temperature_loc)).clear();
	  driver.findElement(By.name(Temperature_loc)).sendKeys(InvalidTemperature);
	  driver.findElement(By.name(Speed_loc)).sendKeys(InvalidSpeed);
	  driver.findElement(By.xpath(HowColdDoesItFeelButton)).click();	  	

  }
  @Test
  public void verifyCountCoinsLinkWithValidData() {
	  String CountCoins_link =props.getProperty("CountCoins_link_loc"); 
	  String Quarter_loc =props.getProperty("Quarter_loc"); 
	  String ValidQuarter=props.getProperty("ValidQuarter"); 
	  String Dimes_loc =props.getProperty("Dimes_loc"); 
	  String ValidDimes =props.getProperty("ValidDimes"); 
	  String Nickels_loc =props.getProperty("Nickels_loc"); 
	  String ValidNickels =props.getProperty("ValidNickels"); 
	  String HelpMeCountItButton =props.getProperty("HelpMeCountItButton_loc");
	  driver.findElement(By.linkText(CountCoins_link)).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.name(Quarter_loc)).sendKeys(ValidQuarter);
	  driver.findElement(By.name(Dimes_loc)).sendKeys(ValidDimes);
	  driver.findElement(By.name(Nickels_loc)).sendKeys(ValidNickels);
	  driver.findElement(By.xpath(HelpMeCountItButton)).click();	  	

  }
  @Test
  public void verifyCountCoinsLinkWithInvalidData() {
	  String CountCoins_link =props.getProperty("CountCoins_link_loc"); 
	  String Quarter_loc =props.getProperty("Quarter_loc"); 
	  String InvalidQuarter=props.getProperty("InvalidQuarter"); 
	  String Dimes_loc =props.getProperty("Dimes_loc"); 
	  String InvalidDimes =props.getProperty("InvalidDimes"); 
	  String Nickels_loc =props.getProperty("Nickels_loc"); 
	  String InvalidNickels =props.getProperty("InvalidNickels"); 
	  String HelpMeCountItButton =props.getProperty("HelpMeCountItButton_loc");
	  driver.findElement(By.linkText(CountCoins_link)).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.name(Quarter_loc)).sendKeys(InvalidQuarter);
	  driver.findElement(By.name(Dimes_loc)).sendKeys(InvalidDimes);
	  driver.findElement(By.name(Nickels_loc)).sendKeys(InvalidNickels);
	  driver.findElement(By.xpath(HelpMeCountItButton)).click();	  	

  }
  @Test
  public void verifyLotteryOddsLinkWithValidData() {
	  String LotteryOdds_link =props.getProperty("LotteryOdds_link_loc"); 
	  String CorrectNumber_loc =props.getProperty("CorrectNumber_loc"); 
	  String ValidCorrectNumber=props.getProperty("ValidCorrectNumber"); 
	  String LowestNumber_loc =props.getProperty("LowestNumber_loc"); 
	  String ValidLowestNumber =props.getProperty("ValidLowestNumber"); 
	  String HighestNumber_loc =props.getProperty("HighestNumber_loc"); 
	  String ValidHighestNumber =props.getProperty("ValidHighestNumber"); 
	  String WhatAreMyOddsButton =props.getProperty("WhatAreMyOddsButton_loc");
	  driver.findElement(By.linkText(LotteryOdds_link)).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.name(CorrectNumber_loc)).sendKeys(ValidCorrectNumber);
	  driver.findElement(By.name(LowestNumber_loc)).sendKeys(ValidLowestNumber);
	  driver.findElement(By.name(HighestNumber_loc)).sendKeys(ValidHighestNumber);
	  driver.findElement(By.xpath(WhatAreMyOddsButton)).click();	  	

  }
  @Test
  public void verifyLotteryOddsLinkWithInvalidData() {
	  String LotteryOdds_link =props.getProperty("LotteryOdds_link_loc"); 
	  String CorrectNumber_loc =props.getProperty("CorrectNumber_loc"); 
	  String InvalidCorrectNumber=props.getProperty("InvalidCorrectNumber"); 
	  String LowestNumber_loc =props.getProperty("LowestNumber_loc"); 
	  String InvalidLowestNumber =props.getProperty("InvalidLowestNumber"); 
	  String HighestNumber_loc =props.getProperty("HighestNumber_loc"); 
	  String InvalidHighestNumber =props.getProperty("InvalidHighestNumber"); 
	  String WhatAreMyOddsButton =props.getProperty("WhatAreMyOddsButton_loc");
	  driver.findElement(By.linkText(LotteryOdds_link)).click();
	  System.out.println(driver.getTitle());
	  
	  driver.findElement(By.name(CorrectNumber_loc)).sendKeys(InvalidCorrectNumber);
	  driver.findElement(By.name(LowestNumber_loc)).sendKeys(InvalidLowestNumber);
	  driver.findElement(By.name(HighestNumber_loc)).sendKeys(InvalidHighestNumber);
	  driver.findElement(By.xpath(WhatAreMyOddsButton)).click();	  	

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
