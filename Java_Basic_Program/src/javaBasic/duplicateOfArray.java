package javaBasic;
//Write a Java program to find the duplicate values of an array of integer values
import java.util.Scanner;
public class duplicateOfArray {
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
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}	
			}
		}
		sc.close();
	}
}
