package javaBasic;
//Write a Java program to swap two variables

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  two number ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		System.out.println("Before swap:  ");
		System.out.println(" a :"+a+" b : "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap:  ");
		System.out.println(" a :"+a+" b : "+b);
//		sc.close();

	}

}
