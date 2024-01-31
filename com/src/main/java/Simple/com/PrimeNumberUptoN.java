package Simple.com;

public class PrimeNumberUptoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,i=0;
		System.out.println("prime Number from 1 to 100 are :");
		for(i=1;i<=100;i++) {
			int count=0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count=count+1;
					
				}
			}
			if(count==2) {
				System.out.println(i+"");
			}
		}
		

	}

}
