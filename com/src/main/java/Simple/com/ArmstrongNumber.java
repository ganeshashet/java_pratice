package Simple.com;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=407,arg,r,sum=0;
		arg=n;
		for(int i=1;i<n;i++) {
			while(n>0) {
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
		}
		if(arg==sum) {
			System.out.println("Given number is armstrong number "+arg);
		}
		else
		{
			System.out.println("Given number is  not armstrong number "+arg);
		}

	}

}
