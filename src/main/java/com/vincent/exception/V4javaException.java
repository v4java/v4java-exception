package com.vincent.exception;

import org.apache.log4j.Logger;


public class V4javaException extends Exception{
	
	private static final Logger logger = Logger.getLogger(V4javaException.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1117121627239476131L;
	
	public V4javaException() {  
        super();  
    }  
      
    public V4javaException(Throwable t) {  
        super(t);  
        logger.error(t.getMessage(),t);
    }  
      
    public V4javaException(String error) {
        super(error);  
        logger.info(error);
    }  
      
    public V4javaException(String error, Throwable t) {
        super(error, t);
        logger.error(error,t);
    }  
	
}
