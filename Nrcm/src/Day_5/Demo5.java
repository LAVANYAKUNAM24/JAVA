package Day_5;
class Chocolate{
	void eat() {
		System.out.println("eating");
	}
}
class Dark extends Chocolate{
	void taste1() {
		System.out.println("dark chocolate bitter");
	}
}
class Sweet extends Chocolate{
	void taste2() {
		System.out.println("sweet chocolate yumm");
	}
}
class Bournaville extends Dark{
	void cost1() {
		System.out.println("bournaville cost is 100");
	}
}
class Amul extends Dark{
	void cost2() {
		System.out.println("amul cost is 200");
	}
}
class Dairymilk extends Sweet{
	void weight1() {
		System.out.println("weight is 100gm");
	}
}
class Kitkat extends Sweet{
	void weight2() {
		System.out.println("weight is 330gm");
	}
}

public class Demo5 {
	public static void main(String[] args) {
		Bournaville b1=new Bournaville();
		 Amul a1=new  Amul ();
		 Dairymilk d1=new Dairymilk();
		 Kitkat k1=new Kitkat();
		 b1.eat();
		 b1.taste1();
		 b1.cost1();
		 a1.eat();
		 a1.taste1();
		 a1.cost2();
		 d1.eat();
		 d1.taste2();
		 d1.weight1();
		 k1.eat();
		 k1.taste2();
		 k1.weight2();
		 
		 
		 
		//heirarchial inheritance
	}

}
