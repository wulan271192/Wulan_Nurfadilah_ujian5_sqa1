package com.UjianSelenium1.sqa.UjianSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UjianSelenium1.sqa.Driver.DriverSingletonSelenium;

public class Dresses {
	private WebDriver driver;
	public Dresses() {
		this.driver = DriverSingletonSelenium.getDriver();
		PageFactory.initElements(driver, this);
	}
@FindBy(css = "#block_top_menu > ul > li:nth-child(2)")
private WebElement btnDresses;

@FindBy(css = "#center_column > ul > li > div > div.right-block > h5 > a")
private WebElement btnViewDresses;

@FindBy(css = "#add_to_cart > button")
private WebElement btnAddCart;

@FindBy(css = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span")
private WebElement btnContinue;


public void buttonDresses() {
	btnDresses.click();
	btnViewDresses.click();
	btnAddCart.click();
	
}
}
