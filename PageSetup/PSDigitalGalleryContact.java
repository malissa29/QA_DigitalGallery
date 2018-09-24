package com.uta.DigitalGallery.PageSetup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class PSDigitalGalleryContact {
	
	@FindBy(xpath="//*[@id=\"primary-nav\"]/ul/li[3]/a") //lnk for contact
	public static WebElement lnkcontact;
	
	@FindBy(xpath="/html/body/div[2]/div/section/h1") //Contact us header for ref  
	public static WebElement headerContactPage;
	
}
