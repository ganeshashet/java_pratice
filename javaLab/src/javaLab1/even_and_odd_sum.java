package javaLab1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class even_and_odd_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(checkpassword(str));
				

	}
	public static int checkpassword(String str) {
		int n=str.length();
		if(n<4) 
			return 0;
		if(str.charAt(0)>= '0'&& str.charAt(0)<='9'){
		return 0;
		}
		int cap=0,num=0;
		for(int i=0;i<n;i++) {
			if(str.charAt(i)==' '&& str.charAt(i)== '/') {
				return 0;
			}
			if(str.charAt(i)>='A'&& str.charAt(i)<= 'Z')
				cap++;
			if(str.charAt(i)>='0'&& str.charAt(i)<= '9')
				num++;
		}
		if(cap>0&& num>0) {
			return 1;
		}
		else
			return 0;
//		if(Pattern.matches("[a-zA-Z0-9]{4-13}",str)) {
//			return 1;
//		}
	}

}
