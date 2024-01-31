package test;

import java.util.Scanner;

public class SceretKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("input 1: ");
		String input1=sc.nextLine();
		//System.out.println("input 1: "+input1);
		System.out.println("input 2: ");
		String input2=sc.nextLine();
		//System.out.println("input 2: "+input2);
		
		System.out.println("input 1: "+input1);
		System.out.println("input 2: "+input2);
		
		
		int[] array=new int[input1.length()];
		for(int i=0;i<input1.length();i++) {
			array[i]=input1.charAt(i)-'0';
		}
		for(int a:array) {
			System.out.println(a);
		}
		
		
////		int last=input2.charAt(i)-'0';
//		for(int i=0;i<input1.length();i++) {
//			int digit=input1.charAt(i)-'0';
//			if(digit%2==0) {
//				digit+=i;
//			}
//			else {
//				Sceretkey+=digit;
//			}
//			Sceretkey=digit+input2.lastIndexOf(i);
//		}
		 String secretKey = generateSecretkey(input1, input2);
		  System.out.println("The secret lore is: " + secretKey);
	  }

	  private static String generateSecretkey(String input1, String input2) {
	    char last = input2.charAt(input2.length() - 1);

	    int sumOfDigits = 0;
	    for (char digit : input1.toCharArray()) {
	      sumOfDigits += digit - '0';
	      if (sumOfDigits % 2 == 0) {
	        break;
	      }
	    }


	    String secret = Integer.toString(sumOfDigits) + last;

	    String nextdigit = input1.substring(last);

	    sumOfDigits = 0;
	    for (char digit : nextdigit.toCharArray()) {
	      sumOfDigits += digit - '0';
	      if (sumOfDigits % 2 == 1) {
	        break;
	      }
	    }
	    secret += Integer.toString(sumOfDigits) + input2.charAt(input2.length() - 2);

	    return secret;
	  
	}
	

}
