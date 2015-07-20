package com.vincent.exception;

import org.apache.log4j.Logger;


public class SQLException extends java.sql.SQLException{
	
	private static final Logger logger = Logger.getLogger(SQLException.class);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1117121627239476131L;
	
	public SQLException() {  
        super();  
    }  
      
    public SQLException(Throwable t) {  
        super(t);  
        logger.error(t.getMessage(),t);
    }  
      
    public SQLException(String error) {
        super(error);  
        logger.info(error);
    }  
      
    public SQLException(String error, Throwable t) {
        super(error, t);
        logger.error(error,t);
    }  
	
}
