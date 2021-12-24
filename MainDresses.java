package com.UjianSelenium1.sqa.main;

import org.openqa.selenium.WebDriver;

import com.UjianSelenium1.sqa.Driver.DriverSingletonSelenium;
import com.UjianSelenium1.sqa.UjianSelenium.Dresses;
import com.UjianSelenium1.sqa.UjianSelenium.Tshirt;

public class MainDresses {
	public static void main(String[] args) {
		WebDriver driver = DriverSingletonSelenium.getInstance().getDriver();
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		driver.manage().window().maximize();	
		Dresses dresses = new Dresses();
		
		dresses.buttonDresses();
}


	
	}

