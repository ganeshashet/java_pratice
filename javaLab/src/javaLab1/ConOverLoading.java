package javaLab1;

import java.util.Scanner;

public class ConOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the value of m: ");
	        int m = scanner.nextInt();

	        System.out.print("Enter the value of n: ");
	        int n = scanner.nextInt();

	        // Find the sum of all integers ranging between 1 to n which are not divisible by m.
	        int sumOfIntegersNotDivisibleByM = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % m != 0) {
	                sumOfIntegersNotDivisibleByM += i;
	            }
	        }

	        // Find the sum of all integers ranging between 1 to n which are divisible by m.
	        int sumOfIntegersDivisibleByM = (n / m) * m;

	        // Find the difference between the sum of integers not divisible by m with the sum of integers divisible by m.
	        int difference = sumOfIntegersNotDivisibleByM - sumOfIntegersDivisibleByM;

	        System.out.println("The sum of all integers ranging between 1 to n which are not divisible by m is: " + sumOfIntegersNotDivisibleByM);
	        System.out.println("The sum of all integers ranging between 1 to n which are divisible by m is: " + sumOfIntegersDivisibleByM);
	        System.out.println("The difference between the sum of integers not divisible by m with the sum of integers divisible by m is: " + difference);

	}

}
