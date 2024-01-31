package javaLab1;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()!=s2.length()) {
			System.out.println("no");
		}
		else {
			
		
		
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i]!=c2[i]) {
					System.out.println("no");
					break;
				}
				else {
					System.out.println("true");
					break;
				}
				
			}
		
		}
		
		}

	}

}
