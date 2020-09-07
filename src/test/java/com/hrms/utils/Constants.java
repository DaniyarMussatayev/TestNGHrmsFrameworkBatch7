package com.hrms.utils;

public class Constants {
	public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/configs/configuration.properties";

	public static final String TESTDATA_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/testdata/HrmsTestData.xlsx";
	public static final String CHROMEDRIVER_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/chromedriver.exe";
	public static final String FIREFOX_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/geckodriver.exe";
	public static final String EDGEDRIVER_FILEPATH = System.getProperty("user.dir")
			+ "/src/test/resources/drivers/msedgedriver.exe";
	public static final int IMPLICIT_WAIT_TIME=20;
	public static final int EXPLICIT_WAIT_TIME=20;
}
