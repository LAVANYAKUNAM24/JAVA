package Day_1;

public class Test4 {
	int s=5;
	static int r=5,l=9,b=6;
	
	void circle() {
		System.out.println(3.14*r*r);
	}
	static void rec() {
		System.out.println(l*b);
	}
	void square()
	{
		System.out.println(s*s);
	}
	static void triangle() {
		int base=5,height=8;
		System.out.println(base*height/2);
	}
	public static void main(String[] args) {
		
		Test4 t4=new Test4();
		t4.circle();
		rec();
		t4.square();
		triangle();
	}
	

}
