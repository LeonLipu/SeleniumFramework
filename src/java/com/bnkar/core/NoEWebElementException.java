package bnkar.core;

import org.openqa.selenium.NoSuchElementException;

public class NoEWebElementException extends NoSuchElementException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6364414656865502113L;

	public NoEWebElementException(String reason) {
		// TODO Auto-generated constructor stub
		
		super(reason);
	}

	
	  public NoEWebElementException(String reason, Throwable cause) {
		    super(reason, cause);
		  }

}
