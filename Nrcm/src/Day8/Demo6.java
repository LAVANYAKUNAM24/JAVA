package Day8;

class Test31 extends Thread {
	public void run() {
		System.out.println("hi");
	}
}
	class Test41 implements Runnable {
		public void run() {
			System.out.println("good morning");
		}
	}
	public class Demo6{
	public static void main(String[] args) {
		Test31 t1=new Test31();
		Test41 t2=new Test41();
		//Thread t1=new Thread(d1);
		Thread t4=new Thread(t2);
		//System.out.println("heloo");
		t1.start();
		t4.start();
		

	}
	}