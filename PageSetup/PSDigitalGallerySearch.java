package com.uta.DigitalGallery.PageSetup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PSDigitalGallerySearch {
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div[1]/div[2]/a") //lnk for search
	public static WebElement lnkSearch;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1") //search header
	public static WebElement headerSearch;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/ul/li[3]/a") //search items link
	public static WebElement lnkSearchItems;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/ul/li[1]/a") //browse all link
	public static WebElement lnkBrowseAll;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1") //browse all header
	public static WebElement headerBrowseAll;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/ul/li[2]/a") //BrowseByTag link
	public static WebElement lnkBrowseByTag;
	
	@FindBy(xpath="//*[@id=\"content\"]/h1") //BrowseByTag header
	public static WebElement headerBrowseByTag;
	
	@FindBy(xpath="//*[@id=\"content\"]/p") //BrowseByTag text
	public static WebElement txtBrowseByTag;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/ul/li[4]/a") //Map link
	public static WebElement lnkMap;
	
	@FindBy(xpath="//*[@id=\"map-links\"]/h2") //Map header
	public static WebElement headerMap;
	
	@FindBy(id="search-keywords") //Keyword top txt
	public static WebElement Keywordtxt;
	
	@FindBy(id="keyword-search") //Search for Keywords TextBox
	public static WebElement SearchTextBox;
	
	@FindBy(id="submit_search_advanced") //Btn for Submit
	public static WebElement SubmitButton;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div[2]") //item descrip
	public static WebElement item_descrip;
	
	@FindBy(xpath="//*[@id=\"search-narrow-by-fields\"]/div[2]/div/select[1]") //drop down for description
	public static WebElement dropdown_descrip;
	
	@FindBy(xpath="//*[@id=\"search-narrow-by-fields\"]/div[2]/div/select[2]") //drop down for contains
	public static WebElement dropdown_contains;
	
	@FindBy(xpath="//*[@id=\"search-narrow-by-fields\"]/div[2]/div[1]/input") //Second TextBox
	public static WebElement SecondTextBox;
	
	@FindBy(xpath="//*[@id=\"search-narrow-by-fields\"]/button") //Btn for Add a field
	public static WebElement btn_AddAField;
	
	@FindBy(xpath="//*[@id=\"search-narrow-by-fields\"]/div[2]/div[2]") //Box for Add a field
	public static WebElement AddAFieldBox;
	
	@FindBy(xpath="//*[@id=\"search-narrow-by-fields\"]/div[2]/div[2]/button") //Btn to remove Add a field
	public static WebElement btn_Remove;
	
	
	
	
	
	
	
	
	
	
	
	
	

}
