package com.uta.DigitalGallery.TestSuit;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryAbout;
import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryHome;
import com.uta.DigitalGallery.PageSetup.PSInitialSetup;

public class AboutVerify {
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
		  PSInitialSetup.lnkAbout.click();
		  
	  }
	  
	  @Test(priority=2)
	  public void T02()
	  {
		  String gen_title = driver.getTitle();
		  //System.out.println(gen_title);
		  String exp_title= "About · UTA Libraries";
		  assertEquals(gen_title, exp_title);
	  }
	  
	  @Test(priority=3)
	  public void T03()
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  String headerValAbout= PSDigitalGalleryAbout.headerAboutPage.getTagName();
		  assertEquals("h1", headerValAbout);
	  }
	  
	  @Test(priority=4)
	  public void T04()
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  String lnkHome= PSDigitalGalleryAbout.lnkHome.getTagName();
		  //System.out.println(lnkHome);
		  assertEquals("a", lnkHome);
		  PSDigitalGalleryAbout.lnkHome.click();
		  String txt= PSDigitalGalleryAbout.welcomeHome.getText();
	      assertEquals("WELCOME", txt);
		  driver.navigate().back();
		  String lnkTxt= PSDigitalGalleryAbout.lnkHome.getText();
		  assertEquals("Home", lnkTxt);
		
	  }
	  
	  @Test(priority=5)
	  public void T05() throws IOException, InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  Assert.assertEquals("Welcome to the Digital Gallery of the University of Texas at Arlington (UTA) Libraries. This site features materials drawn from the wealth and diversity of items held by the Libraries. In addition to Library materials, we plan to include exhibits of collaborations with UTA faculty and students. Come back often because items are being added regularly. If you have additional information about any of the items on this site, please contact us.", PSDigitalGalleryAbout.paragraph1.getText());

	  }
	  
	  @Test(priority=6)
	  public void T06() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  String contactlnk= PSDigitalGalleryAbout.contactlinkbtn.getTagName();
		  assertEquals("a", contactlnk);
		  PSDigitalGalleryAbout.contactlinkbtn.click();
		  ArrayList tab1 = new ArrayList (driver.getWindowHandles());
	      //System.out.println(tab1.size());
	      driver.switchTo().window((String) tab1.get(1)); 
		  Thread.sleep(1000);
		  String headervalcon= PSDigitalGalleryAbout.headerContactPage.getTagName();
		  assertEquals("h1",headervalcon);
		  driver.close();
		  driver.switchTo().window((String) tab1.get(0));
	  }
	  
	  @Test(priority=7)
	  public void T07() throws IOException, InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  Assert.assertEquals("Using state-of-the-art scanning technology, we are dedicated to preserving, providing access to, and promoting the use of the unique objects of the UTA Libraries, faculty and students.  Our Digital  Gallery  has been developed as a way to make our digital resources available to researchers, faculty and students at any time. This includes rare and archival resources that have been digitized as well as born-digital resources. Our Digital  Gallery is also designed to manage and preserve our resources for future availability to our researchers, faculty and students -- even if the original objects have become vulnerable over time.  Without this, many of our collections would only be available to researchers, faculty and students who are able to physically visit our libraries. By giving a higher profile to our digital collections, we hope to foster a culture of digital research.", PSDigitalGalleryAbout.paragraph2.getText());

	  }
	  
	  @Test(priority=8)
	  public void T08() throws IOException, InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  Assert.assertEquals("The site contains representative images from  various collections located at the University of Texas at Arlington Libraries Special Collections:", PSDigitalGalleryAbout.paragraph3.getText());
		  
	  }
	  
	  @Test(priority=9)
	  public void T09_VerifyList() throws IOException, InterruptedException
	  {
		  ArrayList<String> li_elements = new ArrayList<String>();
		  li_elements.add("\"American Hands in Action\" Photograph Album, 1939");
		  li_elements.add("Basil Clemons Photograph Collection, 1919-1948");
		  li_elements.add("Berachah Home Collection, 1901-1985");	
		  li_elements.add("Charlotte Graham Papers, 1935-1985");
		  li_elements.add("Flora and Dickson Reeder Papers, 1871-1995");
		  li_elements.add("Fort Worth Star-Telegram Collection, c. 1849-1990");
		  li_elements.add("Jack White Photograph Collection, c. 1873-1983");
		  li_elements.add("John J. Good Family Papers, 1850-2003");
		  li_elements.add("J. W. Dunlop Photograph Collection");	
		  li_elements.add("Kendall Family Papers, 1789-1949");
		  li_elements.add("Margie Greenup Parker County Centennial Scrapbook");
		  li_elements.add("Pancho Medrano Papers, 1946-1971");
		  li_elements.add("Reeder School Records, ca. 1948-1994");
		  li_elements.add("Squire Haskins Photography, Inc. Collection, [1880s]-2002");
		  li_elements.add("Texas photograph Collection, ca. 1870-");	
		  li_elements.add("Thurber, Texas, Collection, 1891-1969");
		  li_elements.add("University of Texas at Arlington Photograph Collection, 1895-1979");
		  li_elements.add("W. D. Smith Commercial Photography Negatives, 1941-1989");
		  li_elements.add("William E. Jary collection of Dallas and Texas History Materials");
		  
		  PageFactory.initElements(driver, PSDigitalGalleryAbout.class);
		  int j=0;
		  for (int i=1; i<20; i++) {
			  String test=driver.findElement(By.xpath("//*[@id=\"primary\"]/ul/li["+i+"]")).getText();
			  
			  Assert.assertEquals(li_elements.get(j), test);
			  j++;
			 }
		  
	  }
	  
	  
	  @AfterClass
	  public void quit()
	  {
	   driver.quit();
	  }

}
