package Day_1;

public class test_2 {
	int a=34,b=44;
	static int  x=90,y=60;
	
	void not() {
		int p=66,q=77;
		System.out.println(!(p<q));
		
	}
	public static void main(String[] args) {
	   test_2 t2=new test_2();
	   System.out.println((t2.a<t2.y)&& (t2.a==t2.b));
	   System.out.println((test_2.x>test_2.y)||(test_2.x<=test_2.y));
	   t2.not();
	   
	}
}
