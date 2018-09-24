package com.uta.DigitalGallery.TestSuit;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.uta.DigitalGallery.PageSetup.PSDigitalGalleryHome;

public class CommonHeaderFooter {
		WebDriver driver;
		
	  public void T03_MainHeaderImage() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgDigitalGallery.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/digitalgallery/files/theme_uploads/2c46471f7f960de59bd7141ebffc9021.png", imageUrl);
	  }
	  
	  public void T04_TopRightImage() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgSmall.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/sites/default/files/univ_logo_small.png", imageUrl);
	  }
	  
	  
	  public void T15_ImageBottomLeft() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgWhite.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/Library%20Logo%20verticalWhite.png", imageUrl);
	  }
	  
	  
	  public void T16_ImageBottomSocialMedia() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgSocialMedia.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/cc-by-nc.png", imageUrl);
	  }
	  
	  
	  public void T17_ImageFacebook() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgFacebook.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/facebook.png", imageUrl);
	  }
	  
	  public void T18_ImageTwitter() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgTwitter.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/twitter.png", imageUrl);
	  }
	  
	  public void T19_ImagePinterest() throws IOException
	  {
		  PageFactory.initElements(driver, PSDigitalGalleryHome.class);
		  
		  String imageUrl=	PSDigitalGalleryHome.imgPinterest.getAttribute("src");
		  //System.out.println("Image source path : \n"+ imageUrl);

		 assertEquals("https://library.uta.edu/digitalgallery/themes/berlin/images/pinterest.png", imageUrl);
	  }
	  
	  
	  
}
