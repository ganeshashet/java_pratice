package task2;

import java.util.Scanner;
// task2 :Write a Java program to reverse an array of integer values.
public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of n :");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number of array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Reverse array elements");
		for(int i=n-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		sc.close();

	}

}
