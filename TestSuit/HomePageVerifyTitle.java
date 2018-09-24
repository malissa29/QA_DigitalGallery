package com.uta.DigitalGallery.TestSuit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;


import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryHome;
import com.uta.DigitalGallery.PageSetup.PSInitialSetup;

@Test
public class HomePageVerifyTitle {
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
  public void T01_Open() throws InterruptedException {
	  PageFactory.initElements(driver, PSInitialSetup.class);
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  driver.get(PSInitialSetup.url);
	  
	  PSInitialSetup.lnkDigitalCollections.click();
	  Thread.sleep(1000);
	  PSInitialSetup.lnkDigitalGallery.click();
	  
  }
  
  @Test(priority=2)
  public void T02_CheckTitle()
  {
	  String gen_title = driver.getTitle();
	  String exp_title= "UTA Libraries";
	  assertEquals(gen_title, exp_title);
  }
  
 
@Test(priority=3)
  public void CommonTest() throws IOException
  {
	  CommonHeaderFooter commonHeaderFooter = new CommonHeaderFooter() ;
	  commonHeaderFooter.T03_MainHeaderImage();
	  //commonHeaderFooter.T04_TopRightImage();
	  //commonHeaderFooter.T15_ImageBottomLeft();
	  //commonHeaderFooter.T16_ImageBottomSocialMedia();
	  //commonHeaderFooter.T17_ImageFacebook();
	  //commonHeaderFooter.T18_ImageTwitter();
	  //commonHeaderFooter.T19_ImagePinterest();
	  }

 /* @Test(priority=5)
  public void T05_ImageNextToSearch() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgSearch.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/10001685.jpg", imageUrl);
  }
  
  @Test(priority=6)
  public void T06_ImageNextToItems() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgItems.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/10006365.jpg", imageUrl);
  }
  
  @Test(priority=7)
  public void T07_ImageNextToCollection() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCollection.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/10002581.jpg", imageUrl);
  }
  
  @Test(priority=8)
  public void T08_ImageCarousel1() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel1.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/1.jpg", imageUrl);
  }
  
  @Test(priority=9)
  public void T09_ImageCarousel2() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel2.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/2.jpg", imageUrl);
  }
  
  @Test(priority=10)
  public void T10_ImageCarousel3() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel3.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/3.jpg", imageUrl);
  }
  
  @Test(priority=11)
  public void T11_ImageCarousel4() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel4.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/4.jpg", imageUrl);
  }
  
  @Test(priority=12)
  public void T12_ImageCarousel5() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel5.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/5.jpg", imageUrl);
  }
  
  @Test(priority=13)
  public void T13_ImageCarousel6() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel6.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/6.jpg", imageUrl);
  }
  
  @Test(priority=14)
  public void T14_ImageCarousel7() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCarousel7.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);

	 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/images-carousel/7.jpg", imageUrl);
  }

  @Test(priority=20)
  public void T20() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnSearch.click();
	  String headerval1= PSDigitalGalleryHome.pageSearch.getTagName();
	  assertEquals("h1",headerval1);
	  driver.navigate().back();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(priority=21)
  public void T21() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnItems.click();
	  String headerval2= PSDigitalGalleryHome.pageItems.getTagName();
	  assertEquals("h1",headerval2);
	  driver.navigate().back();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(priority=22)
  public void T22() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnCollections.click();
	  String headerval3= PSDigitalGalleryHome.pageCollections.getTagName();
	  assertEquals("h1",headerval3);
	  driver.navigate().back();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(priority=24)
  public void T23() throws Exception 
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnUTAtop.click();
	  ArrayList tabs = new ArrayList (driver.getWindowHandles());
      System.out.println(tabs.size());
      driver.switchTo().window((String) tabs.get(1)); 
	  Thread.sleep(1000);
	  String imageUrl=	PSDigitalGalleryHome.imgUTAtop.getAttribute("src");
	  assertEquals("https://www.uta.edu/_templates/_images/responsive/uta-logo-main.png", imageUrl);
	  driver.close();
	  driver.switchTo().window((String) tabs.get(0));
  }
	 
  
  @Test(priority=23)
  public void T24() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnUTAbottom.click();
	  String linkval2= PSDigitalGalleryHome.pageUTAbottom.getTagName();
	  assertEquals("a",linkval2);
	  driver.navigate().back();
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	  
  }
  
  @Test(priority=25)
  public void T25() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnHome.click();
	  
	  String imageUrl=	PSDigitalGalleryHome.imgDigitalGallery.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);
      assertEquals("https://library.uta.edu/digitalgallery/files/theme_uploads/2c46471f7f960de59bd7141ebffc9021.png", imageUrl);
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @Test(priority=26)
  public void T26() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnCreativeCommons.click();
	  
	  String imageUrl=	PSDigitalGalleryHome.imgCreativeCommons.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);
      assertEquals("https://creativecommons.org/wp-content/themes/cc/images/cc.logo.white.svg", imageUrl);
      driver.navigate().back();
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @Test(priority=27)
  public void T27() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnFacebook.click();
	  
	  String imageUrl=	PSDigitalGalleryHome.imgFacebookPage.getAttribute("src");
	  //System.out.println("Image source path : \n"+ imageUrl);
      assertEquals("https://scontent.ffcm1-2.fna.fbcdn.net/v/t1.0-1/p200x200/23167943_10155834289568827_32457219936004985_n.jpg?_nc_cat=0&oh=978912e01bcf4ea44d773657a383027b&oe=5BF09A31", imageUrl);
      driver.navigate().back();
      try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  @Test(priority=28)
  public void T28() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnTwitter.click();
	  String linkvaltwit= PSDigitalGalleryHome.lnkTwitterPage.getTagName();
	  assertEquals("a",linkvaltwit);
	  driver.navigate().back();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(priority=29)
  public void T29() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnPinterest.click();
	  String headervalpin= PSDigitalGalleryHome.headerPinterestPage.getTagName();
	  assertEquals("h4",headervalpin);
	  driver.navigate().back();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  @Test(priority=30)
  public void T30() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnContact.click();
	  ArrayList tab1 = new ArrayList (driver.getWindowHandles());
      System.out.println(tab1.size());
      driver.switchTo().window((String) tab1.get(1)); 
	  Thread.sleep(1000);
	  String headervalpin= PSDigitalGalleryHome.headerContactPage.getTagName();
	  assertEquals("h1",headervalpin);
	  driver.close();
	  driver.switchTo().window((String) tab1.get(0));
	  
  }
  
  @Test(priority= 31)
  public void T31() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  Assert.assertEquals("This project was generously funded by UTA Libraries.", PSDigitalGalleryHome.txtBottom.getText());

  }
  
  @Test(priority= 32)
  public void T32() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  Assert.assertEquals("Welcome to the Digital Gallery of the University of Texas at Arlington (UTA) Libraries. This site features materials drawn from the wealth and diversity of items held by the Libraries. In addition to Library materials, we plan to include exhibits of collaborations with UTA faculty and students. Come back often because items are being added regularly. If you have additional information about any of the items on this site, please contact us.", PSDigitalGalleryHome.txtWelcome.getText());

  }
  
  @Test(priority= 33)
  public void T33() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  Assert.assertEquals("Professor Allan Saxe in a moment of levity inside a University of Texas at Arlington lecture hall, 1983-11-28 - Item 10002380", PSDigitalGalleryHome.txtcarousel1.getText());

  }
  
  @Test(priority= 34)
  public void T34() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnNext.click();
	  Thread.sleep(2000);
	  System.out.println(PSDigitalGalleryHome.txtcarousel2.getText());
	  Assert.assertEquals("Group of Our Lady of Victory College and Academy high school students on front walk. 1938 (Approximately) - Item 10011848", PSDigitalGalleryHome.txtcarousel2.getText());

  }
  
  @Test(priority= 35)
  public void T35() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnNext.click();
	  Thread.sleep(2000);
	  Assert.assertEquals("UTA Architecture students working in classroom are (from left to right) Danny Richardson, Scot Rasmusssen, Brad Johnson, Suzanne Underwood, 1970-1988 (Approximately) - Item 10015333", PSDigitalGalleryHome.txtcarousel3.getText());

  }
  
  @Test(priority= 36)
  public void T36() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnNext.click();
	  Thread.sleep(2000);
	  Assert.assertEquals("Mrs. Mack Smith's business class, Breckenridge High School. Students are seen reading, some are writing, and two students are practicing using adding machines. 1937-03-22 - Item 20000411", PSDigitalGalleryHome.txtcarousel4.getText());

  }
  
  @Test(priority= 37)
  public void T37() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnNext.click();
	  Thread.sleep(2000);
	  Assert.assertEquals("Mrs. Mullen's First and Second grades group, East Ward, Breckenridge School. Students, both seated and standing, are posing in front of a large blackboard, 1940 - Item 20000415", PSDigitalGalleryHome.txtcarousel5.getText());

  }
  
  @Test(priority= 38)
  public void T38() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnNext.click();
	  Thread.sleep(2000);
	  Assert.assertEquals("Students of Breckenridge's North Ward School pose for a group photograph in front of the school - Item 20000417", PSDigitalGalleryHome.txtcarousel6.getText());

  }
  
  @Test(priority= 39)
  public void T39() throws IOException, InterruptedException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnNext.click();
	  Thread.sleep(2000);
	  Assert.assertEquals("Crossing the street to the playground are E. M. Daggett Elementary School students (left to right) Alice Rachel Moore, Charles Dickie Williamson, Doris June Pritchard, Bill Massey, Mary Ann Rattikin and Jo Ann Sellars, 1940-03-28 - Item 20042576", PSDigitalGalleryHome.txtcarousel7.getText());

  }
  
  @Test(priority=40)
  public void T40() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnAbout.click();
	  String headervalabt= PSDigitalGalleryHome.headerAboutPage.getTagName();
	  assertEquals("h1",headervalabt);
	  driver.navigate().back();
	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
  }
	  
  @Test(priority=41)
  public void T41() throws IOException
  {
	  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
	  PSDigitalGalleryHome.btnContactNav.click();
	  String headervalcon= PSDigitalGalleryHome.headerContactPage.getTagName();
	  assertEquals("h1",headervalcon);
	  driver.navigate().back();
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
*/  
 @AfterClass
  public void quit()
  {
   driver.quit();
  }
  
}
