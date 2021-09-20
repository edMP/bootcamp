package com.everis.mvniniciales;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String a="";
    	Scanner sc= new Scanner(System.in);
    	System.out.println("inserte una cadena");
    	a= sc.nextLine();
    	System.out.println( StringUtils.isAlpha(a) );
    	
    }
   
    
}
