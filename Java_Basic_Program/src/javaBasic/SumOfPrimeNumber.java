package javaBasic;
//Write a Java program to compute the sum of the first 100 prime numbers
public class SumOfPrimeNumber {

	public static void main(String args[])   
	{  
	int count, sum = 0;  
	
	for(int num= 1; num <= 100; num++)  
	{  
	count = 0;  
	for (int i = 2; i <= num/2; i++)  
	{  
	if(num % i == 0)  
	{  
	count++;  
	break;  
	} 
	}
	if(count == 0 && num != 1 )  
	{  
	sum = sum + num;  
	} 
	} 
	System.out.println("The Sum of Prime Numbers from 1 to 100 is: " + sum);  
	} 
}
