package com.simple;
//Write a Java program to find the duplicate values of an array of integer values
public class duplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,3,5,1,5,7,5,1};
		for(int i=0;i<n.length;i++) {
			for(int j=i+1;j<n.length;j++) {
				if(n[i]==n[j]) {
					System.out.println(n[i]);
				}
			}
		}

	}

}
