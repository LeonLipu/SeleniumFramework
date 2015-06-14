package bnkar.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		File file = new File("config.properties");
		FileInputStream input = new FileInputStream(file);
		prop.load(input);
		System.out.println(prop.get("url"));
	}

	public Properties getValuefromPropertyFile(String path) {
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

}
