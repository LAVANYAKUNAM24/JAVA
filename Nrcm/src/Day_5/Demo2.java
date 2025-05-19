package Day_5;
class Bike{
	void speed() {
		System.out.println("250 km per hour");
	}
}
class Bmw extends Bike{
	void rev() {
		System.out.println("1000cc");
	}
}
class model extends Bmw{
	void price(){
		System.out.println("just 30lakhhs");
	
	}
}

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model m1=new model();
		m1.speed();
		m1.rev();
		m1.price();

	}
///multilevel
}
