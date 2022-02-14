package com.Practice1234;

import java.text.SimpleDateFormat;

import java.util.Date;

public class SimpleDate{
    	  
    	  public static void main(String[] args) {
    		  
    		  Date date = new Date();
    		  
    		  SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
    		  
    		  String strDate= formatter.format(date);
    		  
    		  System.out.println(strDate);
    	  } 
}	