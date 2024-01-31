package javaBasic;
//Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.
import java.util.Scanner;
public class sumEqualInArray {
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("entre the size of array");
	 int n=sc.nextInt();
	 System.out.println("entre the array elements");
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
	  a[i]=sc.nextInt();
	 }
	 System.out.println("entre the target");
	  int t=sc.nextInt();
	 checkSum(n,a,t);
	 sc.close();
	 }
	 public static void checkSum(int n,int a[],int t)
	 {
	 for(int i=0;i<n;i++)
	 {
	  for(int j=i+1;j<n;j++)
	  {
	   if(a[i]+a[j]==t)
	   {
	   System.out.println(" by adding array values we got the target value: "+a[i]+","+a[j]);
	    }
	   }
	  }
	 }
}
