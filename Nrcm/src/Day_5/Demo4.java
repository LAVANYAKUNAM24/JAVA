package Day_5;
class Movies{
	void genre() {
		System.out.println("crime and thriller");
	}
}
class Hit extends Movies{
	void action () {
		System.out.println("investigation");
	}
}
class Hero extends Hit{
	void name() {
		System.out.println("nani");
	}
}
class Heroine extends Hero{
	void acting() {
		System.out.println("excellent");
	}
}

public class Demo4 {
	public static void main(String[] args) {
		Hero a1=new Hero();
		Heroine m1=new Heroine();
		a1.genre();
		a1.action();
		a1.name();
		m1.acting();
		//m1.action();
		//m1.genre();
	}
	///hybrid inheritance

}
