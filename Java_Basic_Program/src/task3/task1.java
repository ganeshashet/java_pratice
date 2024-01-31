package task3;

import java.util.Scanner;

//Task1: Write a Java program to get a number from the user and print whether it is positive or negative.
public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to check positive or negative: ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" is positive number");
		}
		else if(num<0){
			System.out.println(num+" is negative number");
		}else {
			System.out.println("number is zero");
		}
		

	}

}
