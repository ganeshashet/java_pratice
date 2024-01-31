package test;

import java.util.Scanner;

public class Maximum_of_minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the subarray segment k : ");
		int k=sc.nextInt();
		System.out.println("enter the value of n : ");
		int n=sc.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("given array is : ");
		for(int a:array) {
			System.out.println(a);
		}
		
		System.out.println("");
		int maxofmin=findmaxofmin(n,k,array);
		System.out.println(maxofmin);
		sc.close();
	}
	public static int findmaxofmin(int n,int k,int[] array) {
		//int maxMin=Integer.MIN_VALUE;
		int minMax=Integer.MAX_VALUE;
		for(int i=0;i<n-k;i++) {
			
//			for(int j=i;j<i+k;j++) {
				minMax=Math.min(minMax, array[i]);
		//	}
			
		}
		return minMax;
	}

}
