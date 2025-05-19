package Day_5;
interface I31{
	void add();
}
class Test13{
	void sub() {
		System.out.println("helloo");
	}
}

public class Demo13 extends Test13 implements I31{
	public void add() {
		System.out.println("hiii");
	}
public static void main(String[] args) {
	Demo13 d1=new Demo13();
	d1.add();
	d1.sub();
}
}
