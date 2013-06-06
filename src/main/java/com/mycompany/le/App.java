package com.mycompany.le;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


/**
 * Hello world!
 *
 */
public class App 
{
	private static Logger log = LogManager.getRootLogger();
	public static void error()
	{
		int [] a = new int [5];
		a[6] = 1;
	}
	
	public static void error2()
	{
		error();
	}
    public static void main( String[] args ) throws IOException
    {
    	
    	log.debug("Process exited with status 1");
    	log.info("this is a logtest");
    	
    	 
    	System.out.println( "Type now!" );
        int s = System.in.read();
        System.out.println( "Type " + s);
    }
}
