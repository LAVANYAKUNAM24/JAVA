package Day_5;
class Fruits{
	void Benifits() {
		System.out.println("healthy");
	}}
class Mango extends Fruits {
	void price() {
		System.out.println("100 per kg");
	}
}
class Apple extends Fruits {
	void color() {
		System.out.println("aple is red");
	}
}
class Grapes extends Fruits {
	void taste() {
	System.out.println("grapes are sweet");
}}


public class Demo3 {
	public static void main(String[] args) {
		Mango m1 =new Mango();
		Apple a1=new Apple();
		Grapes g1=new Grapes();
		m1.Benifits();
		m1.price();
		a1.color();
		g1.taste();
		///multi path
		
	}

}
