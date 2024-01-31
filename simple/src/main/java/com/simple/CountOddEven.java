//Write a Java program to count the number of even and odd elements in a given array
package com.simple;

public class CountOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,2,4,6,8,3,5};
		int oddcount=0,evencount=0;
		for(int i=0;i<n.length;i++) {
			if(i%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
		}
		System.out.println("evenCount :"+evencount);
		System.out.println("oddCount :"+oddcount);

	}

}
