package com.userapp.exception;

public class NameExistsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NameExistsException()
	{
		super();
	}
	public NameExistsException(String message) {
		super(message);
	}
	

}
