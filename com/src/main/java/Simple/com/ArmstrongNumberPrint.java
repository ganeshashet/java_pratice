package Simple.com;

public class ArmstrongNumberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,limit=1000,sum=0;
		System.out.println("Armstrong number from 1 to 1000");
		for(int i=1;i<limit;i++) {
			num=i;
			while(num>0) {
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num=num/10;
				}
			if(sum==i) {
				System.out.println(i+"");
			}
			sum=0;
		}

	}

}
