package javaBasic;
//Write a Java program to add all the digits of a given positive integer

public class Sumofdigit {

	 public static void main(String[] args) {
	        int number = 123454;
	        int sum = SumOfDigits(number);
	        System.out.println("Sum of digits: " + sum);
	    }
	    
	    public static int SumOfDigits(int number) {
	        int sum = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            sum += digit;
	            number /= 10;
	        }
	        return sum;
	    }

}
