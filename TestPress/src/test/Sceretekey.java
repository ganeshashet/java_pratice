package test;
import java.util.*;
public class Sceretekey {

	 static int[] fibonacci;

	    public static void main(String[] args) {
	      int n=4;
	      int input=1;
	      int input2=2;
	      for(int i=0;i<n;i++) {
	    	  for(int j=0;j<n;j++) {
	    		  System.out.print(input);
	    		
	    	  }
	    	  if(i<n-1) {
	    			System.out.println(input2+""+input);
	    		}
	    	  else if(i<n-2){
	    		  System.out.println(input+""+input2);
	    	  }
	    	  else {
	    		  System.out.println(input2);
	    	  }
	    	  System.out.println();
	    	  
	      }
	    }

}
