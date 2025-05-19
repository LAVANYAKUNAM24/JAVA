package Day_5;
class sample5{
	public sample5() {
		System.out.println("good evng");
	}
	int x=90;
	void print() {
		System.out.println("helooo");
	}
}

public class Demo14 extends sample5 {
	public Demo14() {
		super();
		
	}
	void show() {
		int y=45;
		super.print();
		System.out.println(super.x);
		System.out.println(y);
	}
public static void main(String[] args) {
	Demo14 d1=new Demo14();
	d1.show();
	
}
}

