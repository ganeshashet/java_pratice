package javaBasic;


//Write a Java program to print the odd numbers from 1 to 20

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=20;
		System.out.println("odd number from 1 to 20 ");
		for(int i=1;i<n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}

	}

}
