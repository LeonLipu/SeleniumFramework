package bnkar.services;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {


	

	
	@DataProvider(name="dataset")
	public static Object[][] getdata() throws IOException{
		Object [][] ob= new IO().getdataset("./dataset.csv");	
	return ob;
	}

}
