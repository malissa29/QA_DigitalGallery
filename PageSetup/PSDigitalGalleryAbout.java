package com.uta.DigitalGallery.PageSetup;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PSDigitalGalleryAbout {
 
	@FindBy(xpath="//*[@id=\"primary\"]/h1") //Header val 
	public static WebElement headerAboutPage;
	
	@FindBy(xpath="//*[@id=\"simple-pages-breadcrumbs\"]/a") //Home Link 
	public static WebElement lnkHome;
	
	@FindBy(xpath="//*[@id=\"welcome-carousel\"]/h1") //Home Welcome on main page
	public static WebElement welcomeHome;
	
	@FindBy(xpath="//*[@id=\"primary\"]/p[2]") //paragraph 1
	public static WebElement paragraph1;
	
	@FindBy(xpath="//*[@id=\"primary\"]/p[2]/a") //contact link 
	public static WebElement contactlinkbtn;

	@FindBy(xpath="/html/body/div[2]/div/section/h1") //Contact us header for ref  
	public static WebElement headerContactPage;
	
	@FindBy(xpath="//*[@id=\"primary\"]/p[3]") //paragraph 2
	public static WebElement paragraph2;
	
	@FindBy(xpath="//*[@id=\"primary\"]/p[4]") //paragraph 3
	public static WebElement paragraph3;
		
  
}
