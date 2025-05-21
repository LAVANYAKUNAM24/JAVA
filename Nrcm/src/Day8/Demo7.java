package Day8;
class Test51 extends Thread {
	public void run() {
		System.out.println("hello");
	}
}
	class Test61 extends Test51 {
		public void run() {
			System.out.println("good morning");
		}
	}
	class Test71 implements Runnable {
		public void run() {
			System.out.println("good afternoon");
		}
	}
	class Test81 extends Test71 {
		public void run() {
			System.out.println("good evening");
		}
	}
	public class Demo7{
	public static void main(String[] args) {
		Test61 t6=new Test61();
		Test51 t5=new Test51();
		Test71 t7=new Test71();
		Test81 t8=new Test81();
	
		t6.start();
		t5.start();
		Thread t1=new Thread(t7);
		t1.start();
		Thread t2=new Thread(t8);
		t2.start();

	}
	}
