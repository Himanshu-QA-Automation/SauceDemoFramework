package com.saucedemo.utils;

import org.testng.annotations.DataProvider;

public class TestDataProvider {
	@DataProvider(name="loginData",parallel=true)
	public Object[][] getData()
	{
		
		Object[][] data= { {"standard_user", "secret_sauce"},
	            {"problem_user", "secret_sauce"},
	            {"locked_out_user", "wrong_password"}
	};
		return data;

}
@DataProvider(name="loginDataFromExcel")
		
public Object[][] getDataFromExcel()
{
	

	return ExcelUtility.getTestData("LoginData", "./TestData/TestData.xlsx");

}}
