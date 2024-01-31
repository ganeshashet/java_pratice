package task2;

import java.util.Arrays;
import java.util.Scanner;

//Find the second smallest element in an array
public class task5 {

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
		Arrays.sort(a); 
		System.out.println("second smallest element is " + a[0+1]);
		sc.close();
	}
}
