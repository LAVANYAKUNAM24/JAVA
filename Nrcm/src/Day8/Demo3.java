package Day8;
public class Demo3 implements Runnable{
	public void run() {
		System.out.println("hii");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2 d1=new Demo2();
		Demo2 d2=new Demo2();
		
		Thread p1=new Thread(d1);
		Thread p2=new Thread(d2);
		
		System.out.println("heloo");
		p1.start();
		p2.start();

	}

}
