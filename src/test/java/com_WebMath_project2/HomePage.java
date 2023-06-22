package com_WebMath_project2;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class HomePage {
	WebDriver driver;
	FileReader reader;
	Properties props;
  
  @Test (priority=1)
  public void mathHomeworkLink() {
	  String MathHomework_link =props.getProperty("MathHomework_link_loc");  
	  driver.findElement(By.linkText(MathHomework_link)).click();
	  System.out.println(driver.getCurrentUrl());
  }
  @Test (priority=2)
  public void verifyDropdownOptions() {
	  String Dropdown =props.getProperty("Dropdown_loc");  
	WebElement dd=  driver.findElement(By.xpath(Dropdown));
	Select sel=new Select(dd);
	List<WebElement> options = sel.getOptions();
	System.out.println(options.size());

    // Loop to print one by one
    for (int j = 0; j < options.size(); j++) {
        System.out.println(options.get(j).getText());

    }
	  
  }
  @Test (priority=3)
  public void dropdownGoButton() {
	  String Dropdown =props.getProperty("Dropdown_loc");  
		WebElement dd=  driver.findElement(By.xpath(Dropdown));
		Select sel=new Select(dd);
		sel.selectByVisibleText("Interest, Compound");	
	   String GoButton =props.getProperty("GoButton_loc"); 
	   try {
	   driver.findElement(By.xpath(GoButton)).click();
	   }
	   catch (Exception e) {
		   e.printStackTrace();
		   System.out.println(" Go button is not visible after selecting any dropdown option");
	   }
		  
  }
  @Test 
  public void mathProblemWithValidInput() {
	  String Dropdown =props.getProperty("Dropdown_loc");
	  String PrincipalAmount =props.getProperty("PrincipalAmount_loc");
	  String ValidAmount =props.getProperty("ValidAmount");
	  String InterestRate =props.getProperty("InterestRate_loc");
	  String ValidInterestRate =props.getProperty("ValidInterestRate");
	  String CompoundYear =props.getProperty("CompoundYear_loc");
	  String ValidCompoundYear =props.getProperty("ValidCompoundYear");
	  String DesiredTime =props.getProperty("DesiredTime_loc");
	  String ValidDesiredTime =props.getProperty("ValidDesiredTime");
	  String FindAmountButton =props.getProperty("FindAmountButton_loc");
	WebElement dd=  driver.findElement(By.xpath(Dropdown));
	Select sel=new Select(dd);
	sel.selectByVisibleText("Interest, Compound");	
	driver.findElement(By.name(PrincipalAmount)).sendKeys(ValidAmount);
	driver.findElement(By.name(InterestRate)).sendKeys(ValidInterestRate);
	driver.findElement(By.name(CompoundYear)).sendKeys(ValidCompoundYear);
	driver.findElement(By.name(DesiredTime)).sendKeys(ValidDesiredTime);
	driver.findElement(By.xpath(FindAmountButton)).click();
	  
  }
  @Test 
  public void mathProblemWithInvalidInput() {
	  String Dropdown =props.getProperty("Dropdown_loc");
	  String PrincipalAmount =props.getProperty("PrincipalAmount_loc");
	  String InvalidAmount =props.getProperty("InvalidAmount");
	  String InterestRate =props.getProperty("InterestRate_loc");
	  String InvalidInterestRate =props.getProperty("InvalidInterestRate");
	  String CompoundYear =props.getProperty("CompoundYear_loc");
	  String InvalidCompoundYear =props.getProperty("InvalidCompoundYear");
	  String DesiredTime =props.getProperty("DesiredTime_loc");
	  String InvalidDesiredTime =props.getProperty("InvalidDesiredTime");
	  String FindAmountButton =props.getProperty("FindAmountButton_loc");
	WebElement dd=  driver.findElement(By.xpath(Dropdown));
	Select sel=new Select(dd);
	sel.selectByVisibleText("Interest, Compound");	
	driver.findElement(By.name(PrincipalAmount)).sendKeys(InvalidAmount);
	driver.findElement(By.name(InterestRate)).sendKeys(InvalidInterestRate);
	driver.findElement(By.name(CompoundYear)).sendKeys(InvalidCompoundYear);
	driver.findElement(By.name(DesiredTime)).sendKeys(InvalidDesiredTime);
	driver.findElement(By.xpath(FindAmountButton)).click();
	  
  }
  @Test 
  public void backToMathproblemButton() {
	  String Dropdown =props.getProperty("Dropdown_loc");
	  String PrincipalAmount =props.getProperty("PrincipalAmount_loc");
	  String ValidAmount =props.getProperty("ValidAmount");
	  String InterestRate =props.getProperty("InterestRate_loc");
	  String ValidInterestRate =props.getProperty("ValidInterestRate");
	  String CompoundYear =props.getProperty("CompoundYear_loc");
	  String ValidCompoundYear =props.getProperty("ValidCompoundYear");
	  String DesiredTime =props.getProperty("DesiredTime_loc");
	  String ValidDesiredTime =props.getProperty("ValidDesiredTime");
	  String FindAmountButton =props.getProperty("FindAmountButton_loc");
	  String BackToMathProblemButton =props.getProperty("BackToMathProblemButton_loc");
	WebElement dd=  driver.findElement(By.xpath(Dropdown));
	Select sel=new Select(dd);
	sel.selectByVisibleText("Interest, Compound");	
	driver.findElement(By.name(PrincipalAmount)).sendKeys(ValidAmount);
	driver.findElement(By.name(InterestRate)).sendKeys(ValidInterestRate);
	driver.findElement(By.name(CompoundYear)).sendKeys(ValidCompoundYear);
	driver.findElement(By.name(DesiredTime)).sendKeys(ValidDesiredTime);
	driver.findElement(By.xpath(FindAmountButton)).click();
	driver.findElement(By.xpath(BackToMathProblemButton)).click();
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
