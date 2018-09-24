package com.uta.DigitalGallery.TestSuit;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryContact;
import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryHome;
import com.uta.DigitalGallery.PageSetup.PSInitialSetup;

public class ContactVerify {
	WebDriver driver;
	
	  @BeforeClass
	  public void setup() {
	  try {
			System.setProperty("webdriver.chrome.driver", "/Users/malissafiger/Documents/selenium/chromedriver");
			driver= new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			//driver.get(" http://www.google.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  @Test(priority=1)
	  public void T01() throws InterruptedException {
		  PageFactory.initElements(driver, PSInitialSetup.class);
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  driver.get(PSInitialSetup.url);
		  
		  PSInitialSetup.lnkDigitalCollections.click();
		  Thread.sleep(1000);
		  PSInitialSetup.lnkDigitalGallery.click();
		  Thread.sleep(1000);
		  
	  }
	  
	  @Test(priority=6)
	  public void T06() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryContact.class);
		  String contactlnk= PSDigitalGalleryContact.lnkcontact.getTagName();
		  assertEquals("a", contactlnk);
		  PSDigitalGalleryContact.lnkcontact.click();
		  String headervalcon= PSDigitalGalleryContact.headerContactPage.getTagName();
		  assertEquals("h1",headervalcon);
		  String gen_title = driver.getTitle();
		  //System.out.println(gen_title);
		  String exp_title= "Special Collections (Central Library) | UTA Libraries";
		  assertEquals(gen_title, exp_title);
		  driver.navigate().back();
	  }
	  
	  
	  @AfterClass
	  public void quit()
	  {
	   driver.quit();
	  }

}
