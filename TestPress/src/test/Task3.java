//Task 3:- Given an array of numbers, arrange them in a way that it forms the largest value.
package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array:  ");
		int n=sc.nextInt();
		System.out.println("enter a array elements :  ");
		int array[]=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		// sorting
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
		//checking
	
		
		 StringBuilder sb = new StringBuilder();
		 
	      
	        for (int i = n-1; i >= 0; i--) {
	            sb.append(array[i]);
	        }
	     //   System.out.println(sb);
	    //    Arrays.sort(array, Collections.reverseOrder());

	        String largestNumber = "";
	        for (int i = 0; i < array.length; i++) {
	            largestNumber += String.valueOf(array[i]);
	        }
	        System.out.println(largestNumber);
//			String[] strings=new String[n];
//	        for (int i = 0; i < n; i++) {
//	            strings[i] = String.valueOf(array[i]);
//	        }
//	      Arrays.sort(strings, (a, b) -> b + a.compareTo(b));
//	          String largestNumber = "";
//	        for (String string : strings) {
//	            largestNumber += string;
//	        }
	}

}
