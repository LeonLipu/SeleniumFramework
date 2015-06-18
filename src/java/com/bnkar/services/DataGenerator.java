package bnkar.services;

import org.apache.commons.lang3.time.DateUtils;

public class DataGenerator {

	public static void main(String[] args) {
		
	}
	
public static String stringGenerator(String str){
	String tempStr = String.valueOf(DateUtils
											.getTimeinMills())
											+ rand.nextInt((9999 - 1) + 1) + 1;
									String uniqueString = "";
									int len=charset.length();
									int unilen=tempStr.length();
									for (int i = 0; i < len; i++) {
										char ch;

										if (Character
												.isUpperCase(charset.charAt(i))) {
											ch = (char) (Character
													.getNumericValue(tempStr
															.charAt(unilen-len+i)) + 65);
										} else {
											ch = (char) (Character
													.getNumericValue(tempStr
															.charAt(unilen-len+i)) + 97);
										}
										uniqueString = uniqueString + ch;
									}									
									temp=chararr[0]+"@@"+uniqueString;
									//System.out.println(temp);
}
