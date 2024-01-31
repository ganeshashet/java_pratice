// Task2 :- Given a number, check whether it is a prime number or not.
package test;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check prime number or not: ");
		int n=sc.nextInt();
		int count=0;
		if(n==0||n==1) {
			System.out.println("not a prime number");
		}
		else
		{
			for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("Not");
				count=1;
				break;
			 }
			}
		}
		if(count==0) {
			System.out.println("Yes");
		}
		sc.close();

	}

}
