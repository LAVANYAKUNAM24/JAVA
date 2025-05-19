package Day_5;
class Test9{
	void add() {
		System.out.println("hii");
	}
}


public class Demo9 extends Test9 {
	void add() {
		System.out.println("helloo");
	}
	public static void main(String[] args) {
		Demo9 d1 = new Demo9();
		d1.add();
	}

}
