package javaBasic;
import java.util.Scanner;
//Write a Java program to count the number of even and odd elements in a given array
public class CountOddEven {
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
		int oddCount=0,evenCount=0;
		for(int i=1;i<=n;i++) {
			if(i%2==0)
			{
			evenCount++;
			}
			else
			{
			oddCount++;
			}
		}
		System.out.println("total number of even number is :"+evenCount);
		System.out.println("total number of odd number is :"+oddCount);
      sc.close();
	}

}
