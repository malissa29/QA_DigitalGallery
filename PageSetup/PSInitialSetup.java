package com.uta.DigitalGallery.PageSetup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.testng.annotations.Test;

public class PSInitialSetup {
	public static String url="https://library.uta.edu/";
	
	@FindBy(xpath="//*[@id=\"block-menu-menu-left-menu-top\"]/ul/li[4]/a")
	public static WebElement lnkDigitalCollections;
	
	@FindBy(xpath="//*[@id=\"block-system-main\"]/div/div[1]/div[1]/div/div/div[2]/div/div[1]/div/h3/a")
	public static WebElement lnkDigitalGallery;
	
	@FindBy(xpath="//*[@id=\"primary-nav\"]/ul/li[2]/a")
	public static WebElement lnkAbout;
	
	
}
