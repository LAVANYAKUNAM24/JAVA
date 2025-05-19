package Day_5;
class Animal {
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	void Bark() {
	System.out.println("barking");
		
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.Bark();
		d1.sleep();
		
	}
//single inheritance
}
