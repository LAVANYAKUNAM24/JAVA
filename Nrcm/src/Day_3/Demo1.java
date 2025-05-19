package Day_3;

public class Demo1 {
	public static void main(String[] args) {
		String s1="geethu";
		String s2="lavs";
		String s3=new String("lavs");
		String s4=new String("lavs");
		System.out.println(s1.equals(s2));//orginal content
		System.out.println(s1==s2);
		System.out.println(s3.equals(s4));
		System.out.println(s3==s4);
		System.out.println(s2.equals(s4));
		System.out.println(s1.compareTo(s4));


		
		
		
	}

}
