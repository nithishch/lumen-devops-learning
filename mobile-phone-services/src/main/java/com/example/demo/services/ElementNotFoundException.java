package com.example.demo.services;

public class ElementNotFoundException  extends Exception{
	 private String errorCode;



	   public ElementNotFoundException(String errorCode) {
	        super();
	        this.errorCode = errorCode;
	    }




	public ElementNotFoundException(String string, String message) {
		// TODO Auto-generated constructor stub
	}




	@Override
	public String getMessage() {
	    
	    return this.errorCode;
	}
}
