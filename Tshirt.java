package com.UjianSelenium1.sqa.UjianSelenium;

import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.UjianSelenium1.sqa.Driver.DriverSingletonSelenium;

public class Tshirt {
	private WebDriver driver;
	public Tshirt() {
		this.driver = DriverSingletonSelenium.getDriver();
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(css = "#block_top_menu > ul > li:nth-child(3)")
	private WebElement btnTshirt;
	
	@FindBy(css = "#center_column > ul > li > div > div.right-block > h5 > a")
	private WebElement btnViewTshirt;
	
	@FindBy(css = "#add_to_cart > button")
	private WebElement btnAddCart;
		
	
public void buttontshirt() {
		btnTshirt.click();
		btnViewTshirt.click();
		btnAddCart.click();
		




}	
}
	

