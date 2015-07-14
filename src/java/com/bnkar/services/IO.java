package bnkar.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.commons.lang3.ArrayUtils;

public class IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/*
		 * Properties prop = new Properties(); File file = new
		 * File("config.properties"); FileInputStream input = new
		 * FileInputStream(file); prop.load(input);
		 * System.out.println(prop.get("url"));
		 */
		new IO().getdataset("dataset.csv");
	}

	public Properties loadPropertyFile(String path) {
		Properties prop = new Properties();
		File file = new File(path);
		FileInputStream stream;
		try {
			stream = new FileInputStream(file);
			prop.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}

	public Object[][] getdataset(String fileuri) throws IOException {

		Object[][] ob = new Object[1000][];
		Reader in = new FileReader(fileuri);
		BufferedReader bfr = new BufferedReader(in);
		String line;
		int nooflinetoskip = 1, counter = 0, index = 0;

		while ((line = bfr.readLine()) != null) {
			if (nooflinetoskip <= counter)
				ob[index++] = line.split(",");
			 counter++;
		}
		int nullcount = 999;

		while (nullcount > 0) {
			if (ob[nullcount] == null)
				ob = ArrayUtils.removeAll(ob, nullcount);
			nullcount--;
		}
		return ob;
	}
}
