package bnkar.services;

import com.mifmif.common.regex.Generex;

public class DataGenerator {

	public static void main(String[] args) {
		System.out.println(stringGenerator("\\d{28}"));;
	}

	/**
	 * It will generate string depending upon regular expression 
	 * @param str
	 * @return
	 */
	public static String stringGenerator(String str) {		
		return new Generex(str).random();

	}
}
