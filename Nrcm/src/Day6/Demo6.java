package Day6;

public class Demo6 {
	void show() {
		System.out.println("hi");
	}
	class Test6 {
		void print() {
			System.out.println("good morning");
		}
		
	}
public static void main(String[] args) {
		Demo6 d1=new Demo6();
		d1.show();
		Demo6.Test6 t1=new Demo6().new Test6();
		t1.print();
		
	}
	//nested inner class
}
