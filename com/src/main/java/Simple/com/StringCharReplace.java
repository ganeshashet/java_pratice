package Simple.com;

public class StringCharReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="gAnesha";
		char ch;
		for(int i=0;i<name.length();i++) {
			ch=name.charAt(i);
			if(ch=='a'||ch=='A') {
				ch='-';
			}
			System.out.print(ch);
		}
	}

}
