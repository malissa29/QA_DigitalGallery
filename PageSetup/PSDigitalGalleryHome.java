package com.uta.DigitalGallery.PageSetup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PSDigitalGalleryHome {
  
	@FindBy(xpath="//*[@id=\"header-image\"]/img") //topimage 
	public static WebElement imgDigitalGallery;
	
	@FindBy(xpath="//*[@id=\"uta-a\"]/div/a/img") //toprightimage
	public static WebElement imgSmall;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[1]/div[1]/a/img") //img next to search
	public static WebElement imgSearch;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[2]/div[1]/a/img") //img next to items
	public static WebElement imgItems;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[3]/div[1]/a/img") //img next to collections
	public static WebElement imgCollection;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[1]/img") //img on 1st Carousel1
	public static WebElement imgCarousel1;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[2]/img") //img on 1st Carousel2
	public static WebElement imgCarousel2;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[3]/img") //img on 1st Carousel3
	public static WebElement imgCarousel3;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[4]/img") //img on 1st Carousel4
	public static WebElement imgCarousel4;

	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[5]/img") //img on 1st Carousel5
	public static WebElement imgCarousel5;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[6]/img") //img on 1st Carousel6
	public static WebElement imgCarousel6;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[7]/img") //img on 1st Carousel7
	public static WebElement imgCarousel7;
	
	@FindBy(xpath="//*[@id=\"footer-content\"]/div[1]/a/img") //img bottom 
	public static WebElement imgWhite;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[1]/a/img")  // img before all socialmedia
	public static WebElement imgSocialMedia;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[2]/a/img") // img for facebook logo
	public static WebElement imgFacebook;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[3]/a/img") //img for Twitter logo
	public static WebElement imgTwitter;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[4]/a/img") //img for Pinterest logo
	public static WebElement imgPinterest;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[1]/div[2]/a/h1") //search btn link 
	public static WebElement btnSearch;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1") //Search page header
	public static WebElement pageSearch;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[2]/div[2]/a/h1") //item btn link 
	public static WebElement btnItems;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1") //Content page header
	public static WebElement pageItems;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[3]/div[2]/a/h1") //collection btn link
	public static WebElement btnCollections;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1")  //collections page header
	public static WebElement pageCollections;
	
	@FindBy(xpath="//*[@id=\"uta-a\"]/div/a") // top left link
	public static WebElement btnUTAtop;
	
	@FindBy(xpath="//*[@id=\"site-banner\"]/div[1]/a/img") //image on that page for reference
	public static WebElement imgUTAtop;
	
	@FindBy(xpath="//*[@id=\"footer-content\"]/div[1]/a") // bottom left link 
	public static WebElement btnUTAbottom;
	
	@FindBy(xpath="//*[@id=\"block-block-33\"]/p/a[2]") //page top uta link
	public static WebElement pageUTAbottom;
	
	@FindBy(xpath="//*[@id=\"footer-text\"]/li/a") //bottom center home location
	public static WebElement btnHome;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[1]/a") //creative commons link 
	public static WebElement btnCreativeCommons;
	
	@FindBy(xpath="//*[@id=\"masthead\"]/div/div[1]/a/img") //creative commons img  
	public static WebElement imgCreativeCommons;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[2]/a") //Facebook link 
	public static WebElement btnFacebook;
	
	@FindBy(xpath="//*[@id=\"u_0_d\"]/div/a/img") //Facebook page img  
	public static WebElement imgFacebookPage;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[3]/a") //Twitter link 
	public static WebElement btnTwitter;
	
	@FindBy(xpath="//*[@id=\"page-container\"]/div[2]/div/div/div[1]/div/div/div/div[1]/h1/a") //Twitter link  
	public static WebElement lnkTwitterPage;
	
	@FindBy(xpath="//*[@id=\"social-media\"]/li[4]/a") //Pinterest link 
	public static WebElement btnPinterest;
	
	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div[2]/div/div/div[1]/div/div/div[1]/h4") //Pinterest header for reference  
	public static WebElement headerPinterestPage;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/p[4]/span/a") //Contact us link 
	public static WebElement btnContact;
	
	@FindBy(xpath="/html/body/div[2]/div/section/h1") //Contact us header for ref  
	public static WebElement headerContactPage;
	
	@FindBy(xpath="//*[@id=\"footer-text\"]/p/strong") //Bottom text
	public static WebElement txtBottom;
	
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/p[4]/span") //Welcome text
	public static WebElement txtWelcome;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[1]/div/p") //carousel1 text
	public static WebElement txtcarousel1;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[2]/div/p") //carousel2 text
	public static WebElement txtcarousel2;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[3]/div/p") //carousel3 text
	public static WebElement txtcarousel3;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[4]/div/p") //carousel4 text
	public static WebElement txtcarousel4;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[5]/div/p") //carousel5 text
	public static WebElement txtcarousel5;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[6]/div/p") //carousel6 text
	public static WebElement txtcarousel6;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/div/div[7]/div/p") //carousel7 text
	public static WebElement txtcarousel7;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[1]/div/a[2]/span[1]") //btn Next
	public static WebElement btnNext;
	
	@FindBy(xpath="//*[@id=\"primary-nav\"]/ul/li[2]/a") //btn About
	public static WebElement btnAbout;
	
	@FindBy(xpath="//*[@id=\"primary\"]/h1") //About for ref  
	public static WebElement headerAboutPage;
	
	@FindBy(xpath="//*[@id=\"primary-nav\"]/ul/li[3]/a") //btn Contact us top 
	public static WebElement btnContactNav;
	
	
}
