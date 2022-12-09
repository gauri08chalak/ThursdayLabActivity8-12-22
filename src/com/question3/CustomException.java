//Author is Gauri
//Code to create a userdefined exception to check whether the given name exists or not in an array.  

package com.question3;

import java.util.Scanner;

import javax.naming.InvalidNameException;
//import javax.naming.InvalidNameException;

import com.question2.userDefinedException;

public class CustomException extends Throwable {

			void validateName(String name) throws InvalidNameException { 
			
			String[] names = { "Gauri", "Dharuv", "Amruta", "Tejaswi","Divya","Viki"};
	        boolean found= false;
	        
	        for (String n: names)
	        {
	            if (n.equalsIgnoreCase(name))
	            {
	                found = true;
	                break;
	            }
	        }
	        if (found)
	        {
	            System.out.println("Valid Name");
	        } 
	        else 
	        {
	            throw new InvalidNameException("Try Again!!!!!");
	        }
	    }
		public static void main(String[] args) {
			 
			CustomException c=new CustomException();
		        
		        Scanner sc=new Scanner(System.in);
		        
		        //asks for input from the user
		        System.out.println("Enter Name:");
		        String name = sc.next();
		        
		        try
		        {
		            c.validateName(name);
		        }
		        catch(InvalidNameException e) 
		        {
		        	// exception will be thrown if the name entered doesn't match
		            System.out.println("Invalid Name " +e);
		        }
		}
	}


