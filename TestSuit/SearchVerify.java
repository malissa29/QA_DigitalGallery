package com.uta.DigitalGallery.TestSuit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.uta.DigitalGallery.PageSetup.PSDigitalGallerySearch;
import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryHome;
import com.uta.DigitalGallery.PageSetup.PSInitialSetup;

public class SearchVerify {
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
	  public void T01_openpage() throws InterruptedException {
		  PageFactory.initElements(driver, PSInitialSetup.class);
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  driver.get(PSInitialSetup.url);
		  
		  PSInitialSetup.lnkDigitalCollections.click();
		  Thread.sleep(1000);
		  PSInitialSetup.lnkDigitalGallery.click();
		  Thread.sleep(1000);
		  
	  }
	  
	  @Test(priority=2)
	  public void T02_LinkandHeaderCheck() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  String searchlnk= PSDigitalGallerySearch.lnkSearch.getTagName();
		  assertEquals("a", searchlnk);
		  PSDigitalGallerySearch.lnkSearch.click();
		  String headervalsearch= PSDigitalGallerySearch.headerSearch.getTagName();
		  assertEquals("h1",headervalsearch);
		  String gen_title = driver.getTitle();
		  //System.out.println(gen_title);
		  String exp_title= "Search Items · UTA Libraries";
		  assertEquals(gen_title, exp_title); 
		  //driver.navigate().back();
	  }
	  
	 @Test(priority=3)
	  public void T03_Search_Items() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  String searchlnkitems= PSDigitalGallerySearch.lnkSearchItems.getTagName();
		  assertEquals("a", searchlnkitems);
		  PSDigitalGallerySearch.lnkSearchItems.click();
		  String headervalsearch= PSDigitalGallerySearch.headerSearch.getTagName();
		  assertEquals("h1",headervalsearch);
		  //driver.navigate().back();
	  }
	 
	 @Test(priority=3)
	  public void T03_Browse_All() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  String browsealllnk= PSDigitalGallerySearch.lnkBrowseAll.getTagName();
		  assertEquals("a", browsealllnk);
		  PSDigitalGallerySearch.lnkBrowseAll.click();
		  String headervalbrowseall= PSDigitalGallerySearch.headerBrowseAll.getTagName();
		  assertEquals("h1",headervalbrowseall);
		  driver.navigate().back();
	  }
	 
	 @Test(priority=4)
	  public void T04_Browse_ByTag() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  String browsebytaglnk= PSDigitalGallerySearch.lnkBrowseByTag.getTagName();
		  assertEquals("a", browsebytaglnk);
		  PSDigitalGallerySearch.lnkBrowseByTag.click();
		  String headervalbrowsebytag= PSDigitalGallerySearch.headerBrowseByTag.getTagName();
		  assertEquals("h1",headervalbrowsebytag);
		  String browsebytagtxt = PSDigitalGallerySearch.txtBrowseByTag.getText();
		  assertEquals("No tags are available.",browsebytagtxt );
		  driver.navigate().back();
	  }
	 
	 @Test(priority=4)
	  public void T04_Browse_Maps() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  String Maplnk= PSDigitalGallerySearch.lnkMap.getTagName();
		  assertEquals("a", Maplnk);
		  PSDigitalGallerySearch.lnkMap.click();
		  String headervalMap= PSDigitalGallerySearch.headerMap.getTagName();
		  assertEquals("h2",headervalMap);
		  driver.navigate().back();
	  }
	 
	 @Test(priority=5)
	  public void T05_Search_KeyWwords() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  String SearchKeywordtxt= PSDigitalGallerySearch.Keywordtxt.getText();
		  //System.out.println(SearchKeywordtxt);
		  assertEquals("Search for Keywords", SearchKeywordtxt);
		  PSDigitalGallerySearch.SearchTextBox.sendKeys("Hotel Texas");
		  Thread.sleep(2000);
		  PSDigitalGallerySearch.SubmitButton.click();
		  String descrip_val= PSDigitalGallerySearch.item_descrip.getText();
		  assertEquals("Christmas scenes. Dancers in the Hotel Texas Den, where the merrymakers celebrated Christmas Eve in typical style.",descrip_val );
		  driver.navigate().back();
	  }
	 
	 @Test(priority=6)
	  public void T06_Description_Dropdown() throws InterruptedException
	  {
		 ArrayList<String> Description = new ArrayList<String>();
		 Description.add("Select Below ");
		 Description.add("Alternative Title");
		 Description.add("Contributor");
		 Description.add("Coverage");
		 Description.add("Creator");
		 Description.add("Date Copyrighted");
		 Description.add("Date Created");
		 Description.add("Description");
		 Description.add("Format");
		 Description.add("Identifier");
		 Description.add("Language");
		 Description.add("License");
		 Description.add("Publisher");
		 Description.add("Rights");
		 Description.add("Rights Holder");
		 Description.add("Spatial Coverage");
		 Description.add("Subject");
		 Description.add("Title");
		 Description.add("Type");
		 Description.add("Original Format");
		 Description.add("Physical Dimensions");
		 Description.add("Text");
		 // System.out.println(Description);
		 PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		 Select options= new Select(PSDigitalGallerySearch.dropdown_descrip);
		 List <WebElement> elementCount= options.getOptions();
		 System.out.print(elementCount.size());
		 int iSize = elementCount.size();
		  
		  for(int i =0; i<iSize ; i++){
				String sValue = elementCount.get(i).getText();
				assertEquals(Description.get(i), sValue);
				}
	  }
	 
	 @Test(priority=7)
	  public void T07_Contains_Dropdown() throws InterruptedException
	  {
		 ArrayList<String> Description = new ArrayList<String>();
		 Description.add("Select Below ");
		 Description.add("contains");
		 Description.add("does not contain");
		 Description.add("is exactly");
		 Description.add("is empty");
		 Description.add("is not empty");
		 
		 
		 // System.out.println(Description);
		 PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		 Select options= new Select(PSDigitalGallerySearch.dropdown_contains);
		 List <WebElement> elementCount= options.getOptions();
		 System.out.print(elementCount.size());
		 int iSize = elementCount.size();
		  
		  for(int i =0; i<iSize ; i++){
				String sValue = elementCount.get(i).getText();
				assertEquals(Description.get(i), sValue);
				}
	  }
	 
	 @Test(priority=8)
	  public void T08_Second_Textbox() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  PSDigitalGallerySearch.SecondTextBox.sendKeys("Hotel Texas");
		  Thread.sleep(2000);
		  PSDigitalGallerySearch.SubmitButton.click();
		  Thread.sleep(2000);
		  String descrip_val= PSDigitalGallerySearch.item_descrip.getText();
		  assertEquals("Christmas scenes. Dancers in the Hotel Texas Den, where the merrymakers celebrated Christmas Eve in typical style.",descrip_val );
		  Thread.sleep(2000);
		  driver.navigate().back();
		  Thread.sleep(2000);
	  }
	 
	 @Test(priority=9)
	  public void T09_AddAField() throws InterruptedException
	  {
		  PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		  PSDigitalGallerySearch.btn_AddAField.click();
		  Thread.sleep(2000);
		  assertTrue(PSDigitalGallerySearch.AddAFieldBox.isDisplayed());
		  Thread.sleep(2000);
		  PSDigitalGallerySearch.btn_Remove.click();
		  Thread.sleep(2000);
		  
		  
	  }
	 
	 @Test(priority=10)
	  public void T10_Contains_Dropdown_Selected() throws InterruptedException
	  {
		
		 PageFactory.initElements(driver, PSDigitalGallerySearch.class);
		 //Select mySelect= new Select(PSDigitalGallerySearch.dropdown_contains);
		 Select select = new Select(driver.findElement(By.xpath("//*[@id=\"search-narrow-by-fields\"]/div[2]/div/select[2]")));
		 select.selectByVisibleText("does not contain");
		 WebElement option = select.getFirstSelectedOption();
		 System.out.println(option.getText());
		 
	  }
	 
	 
	 
	 @AfterClass
	  public void quit()
	  {
	   driver.quit();
	  }
	  
	  
	  

}
