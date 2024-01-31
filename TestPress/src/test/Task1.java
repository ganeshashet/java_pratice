// Task 1:- Write a program to print the reverse of the given string.
package test;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String to reverse:  ");
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		StringBuilder a=sb.reverse();
		System.out.println(a);
		sc.close();
	}

}
