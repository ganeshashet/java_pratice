package Simple.com;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23432,pal,r,rev=0;
		pal=n;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==pal) {
			System.out.println("given number is palndrome "+pal);
		}
		else {
			System.out.println("given number is not palndrome "+pal);
		}

	}

}
