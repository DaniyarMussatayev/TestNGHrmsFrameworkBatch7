package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashboardPageElements extends BaseClass {
	@FindBy(id = "welcome")
	public WebElement welcomeText;
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);
		
	}


}
