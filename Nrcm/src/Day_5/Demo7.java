package Day_5;


public class Demo7 {
	void show() {
		System.out.println("good mornin");
	}
	void show(int a) {
		System.out.println(a);
	}
	void show(int a,int b) {
		System.out.println(a+b);
	}
	void show(double d1,double d2) {
		System.out.println(d1-d2);
	}
	void show(String s1,String s2) {
		System.out.println(s1+s2);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Demo7 d1=new  Demo7 ();
		 d1.show();
		 d1.show(4, 5);
		 d1.show(3.6, 5.7);
		 d1.show("lavanya","kunam");
		

	}

}
