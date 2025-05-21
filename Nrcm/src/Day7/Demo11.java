package Day7;

public class Demo11 extends Thread {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Demo11 d1=new Demo11();
		Thread t1=new Thread(d1);
		t1.start();
		System.out.println("hii");
		t1.sleep(20000);
		System.out.println("hello");

	}

}
