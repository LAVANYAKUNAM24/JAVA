package Day6;
class Demo100{
	void show() {
		System.out.println("hii");
	}
}
public class Demo10 {
	Demo100 d1=new Demo100() {//anonymous class
		void show() {
			System.out.println("heloo");
			//super.show();
		}
	};
	public static void main(String[] args) {
		Demo10 d=new Demo10();
		d.d1.show();
	}
		

	}


