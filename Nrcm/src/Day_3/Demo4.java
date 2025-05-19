package Day_3;

public class Demo4 {
	public static void main(String[] args) {
		String str="helloworld";
		String vowels="";
		String consonants="";
		for (int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
				vowels+=ch;
			else if(ch>= 'a' && ch<= 'z')
				consonants=consonants+ch;
		}
		System.out.println("consonants are:"+consonants);
		System.out.println("vowels are:"+vowels);
		
		
	}

}
