// Task 5 :- Given an array of numbers, find the maximum and minimum element in the array.
package test;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array:  ");
		int n=sc.nextInt();
		System.out.println("enter a array elements :  ");
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)   {  
		for(int j=i+1;j<n;j++)   {  
		int tmp=0;  
		if(array[i]>array[j])   
		{  
		tmp=array[i];  
		array[i]=array[j];  
		array[j]=tmp;  
		}  
		}  
		}
		
		System.out.println(array[n-1]+" "+array[0]);
		
		sc.close();
	}

}
