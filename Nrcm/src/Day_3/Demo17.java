package Day_3;
abstract class fest{
	abstract void add();
	abstract void sub();
	void div() {
		int a=20,b=10;
		System.out.println(a/b);
	}
	void mod() {
		int a=10,b=20;
		System.out.println(a%b);
	}
	static void mul() {
		int a=10,b=20;
		System.out.println(a*b);
	}
	static void mlti() {
		int a=50,b=20;
		System.out.println(a*b);
	}
}
class Demo17 extends fest{
	public void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	public void sub() {
		int a=20,b=10;
		System.out.println(a-b);
	}
	void sbt() {
		int a=30,b=10;
		System.out.println(a-b);
	}
}
class Day_3{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo17 d1=new Demo17();
		d1.add();
		d1.sub();
		d1.div();
		d1.mod();
		Demo17.mul();
		Demo17.mlti();
		d1.sbt();
	}
}