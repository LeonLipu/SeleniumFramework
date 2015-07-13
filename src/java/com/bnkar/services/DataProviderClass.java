package bnkar.services;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {


	
	@Test(dataProvider="som" )
	public void  test1(String mm ,String str,String ll){
		
		System.out.println("test 1"+str);
	}
	
	@DataProvider(name="som")
	public Object[][] getdata(ITestContext context) throws IOException{
		
		//context.
		Object [][] ob= new IO().getdataset();
		
/*	ob[0][0]=3;
	ob[0][1]="so many";`
	ob[1][0]=4;
	ob[1][1]=" brahmaandsa kaer";*/
	return ob;
	}

}
