package Day6;

public class Demo1 extends Object {
	int a=89;
	void add() {
		int a=89;
		System.out.println(a);
	}
	void sub() {
		
		System.out.println(this.a);
		
		this.add();
	}//local variables are not accessedd in this keywords

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo1();
		d1.sub();

	}

}
