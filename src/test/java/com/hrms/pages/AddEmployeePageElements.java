package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class AddEmployeePageElements extends BaseClass {
	@FindBy(id = "menu_pim_viewPimModule")
	public WebElement pimButton;

	@FindBy(id = "menu_pim_addEmployee")
	WebElement addEmployeeButton;
	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
		
	}
}
