//Author is Gauri
//Code to create a userdefined exception to check whether the given name exists or not in an array.  

package com.question3;

public class CustomException {

			public static void main(String args[]){
			try{
			throw new UserException("gauri");
			}
			catch(UserException e){
			System.out.println(e) ;
			}
			}
			}
			class UserException extends Exception{
			String name;
			UserException(String string) {
				name=string;
			}
			public String toString(){
			return ("array = "+name) ;
			}
			

	}


