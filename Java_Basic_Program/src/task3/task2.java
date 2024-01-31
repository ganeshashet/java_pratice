package task3;

import java.util.Scanner;
//Task8: Write a program in Java to display the pattern like right angle triangle with a number.


public class task2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number : ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}
