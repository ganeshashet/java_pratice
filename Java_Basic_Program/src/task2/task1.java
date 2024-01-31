package task2;


import java.util.Scanner;

// Task1: Write a Java program to find the maximum and minimum value of an array.
public class task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of n :");
	int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the number of array elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        sc.close();
    }
	
}
