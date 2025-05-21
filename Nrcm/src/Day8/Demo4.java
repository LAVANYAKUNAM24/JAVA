package Day8;

public class Demo4 implements Runnable{
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo4 d1=new Demo4();
		Demo4 d2=new Demo4();
		
		System.out.println("heloo");
		d1.run();
		d2.run();

	}

}