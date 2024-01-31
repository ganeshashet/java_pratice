package test;
//Task 3:- Given an array of numbers, arrange them in a way that it forms the largest value.
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class task41 {
	 public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter a size of an array:  ");
			int n=sc.nextInt();
			System.out.println("enter a array elements :  ");
			int array[]=new int[n];
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
			}	
			String[] s_num = new String[n];
			for(int i = 0; i < n; i++)
			{
				s_num[i] = String.valueOf(array[i]);
			}
			Comparator<String> comp = new Comparator<String>(){
				@Override
				public int compare(String str1, String str2){
					String s1 = str1 + str2;
					String s2 = str2 + str1;
					return s2.compareTo(s1); 
				}
			};
			Arrays.sort(s_num, comp);
       
			StringBuilder sb = new StringBuilder();
			for(String s: s_num)
				sb.append(s);
	
			System.out.println(sb);
	
	 }
}
