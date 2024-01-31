package Simple.com;

public class PalindromeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,rem,rev=0;
		int limit=50;
		System.out.println("Palindrome number between 1 to 50 ");
		for(int i=1;i<=limit;i++) {
			n=i;
			while(n>0) {
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
			}
			if(rev==i) {
				System.out.println(i+"");
			}
			rev=0;
		}
	}

}
