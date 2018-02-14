package com.pega.sample.exception;
/**
Exception class to log exception
*/
public class SampleException extends Exception {
	
	public SampleException(String message, Throwable cause) {
        super(message, cause);
    }
	
	public SampleException(Throwable cause) {
        super(cause);
    }

	 public SampleException(String message) {
	        super(message);
	    }
}
