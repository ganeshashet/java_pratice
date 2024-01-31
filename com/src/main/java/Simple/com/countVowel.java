package Simple.com;

public class countVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="GaneshaShet";
		int count=0;
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		System.out.println("the vowels count in String is: "+count);
		
	}

}
