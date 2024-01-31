package test;

import java.util.Scanner;

public class Guess_Game {
	public static int maxguess=11;
	public static String word="base";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("-----Guessing Game----");
		for(int i=0;i<maxguess;i++) {
			System.out.println("enter a char that guess : ");
			char guess=sc.next().charAt(1);
			//char[] word=new char[word.length];
//			if(word.charAt(i)==guess) {
//				char[] w=sc.
//				System.out.println(i);
//				if()
//			}
//			
		}
	}

}
