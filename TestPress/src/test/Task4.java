// task 4:- Given a number N, print reverse of number N.
package test;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to reverse: ");
		int n=sc.nextInt();
		int rev=0;
		while (n != 0) {
		    rev = rev*10+n%10;
		    n =n/ 10;
		  }
			System.out.println(rev);
		sc.close();
	}

}
