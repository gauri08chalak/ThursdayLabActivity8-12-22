//Author is Gauri
//Code to accept the weight and age values of a person through runtime, and if the user enters age less than 18 and weight less than 50

package com.question2;

import java.util.Scanner;
class InvalidAgeWeightException extends Throwable
{
	InvalidAgeWeightException(String str)
	{
		
	}
}
public class userDefinedException {
	     static int age;
		 static int weight;
		 static void validation(int age, int weight) throws InvalidAgeWeightException
		{
				try {
					if(age<=18)
					{
						throw new InvalidAgeWeightException("invalid age");
					}
					else
					{
						System.out.println("valid age");
					}
				}
				catch (InvalidAgeWeightException e) 
				{
					e.printStackTrace();
				}
				try 
				{
					if(weight<50)
					{
					
						throw new InvalidAgeWeightException("invalid weight");
					}
					else
					{
						System.out.println("valid weight");
					}
				} 
				catch (InvalidAgeWeightException e)
				{
					e.printStackTrace();
				}
		}
	public static void main(String[] args) throws InvalidAgeWeightException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int age=sc.nextInt();
		System.out.println("enter the weight:");
		int weight =sc.nextInt();
		userDefinedException e=new userDefinedException();
		e.validation(age, weight);		
	}
	//public void validateName(String name) {
		// TODO Auto-generated method stub
		
	//}
}




