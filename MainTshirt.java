package com.UjianSelenium1.sqa.main;

import org.openqa.selenium.WebDriver;

import com.UjianSelenium1.sqa.Driver.DriverSingletonSelenium;
import com.UjianSelenium1.sqa.UjianSelenium.AutomationPracticeUjian;
import com.UjianSelenium1.sqa.UjianSelenium.Tshirt;

public class MainTshirt {
	public static void main(String[] args) {
		WebDriver driver = DriverSingletonSelenium.getInstance().getDriver();
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		driver.manage().window().maximize();	
		Tshirt tshirt = new Tshirt();
		
		tshirt.buttontshirt();
}


	
	}

