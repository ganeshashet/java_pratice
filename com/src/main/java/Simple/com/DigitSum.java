package Simple.com;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9902, rem=0,sum=0,temp;
		temp=num;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("sum of digit "+temp+" is "+sum);


	}

}
