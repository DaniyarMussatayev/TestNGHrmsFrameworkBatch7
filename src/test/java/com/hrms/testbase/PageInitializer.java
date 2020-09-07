package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;

public class PageInitializer extends BaseClass{



	public static void initializePageObjects() {
		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dash = new DashboardPageElements();
		AddEmployeePageElements addEmp = new AddEmployeePageElements();
	}
}
