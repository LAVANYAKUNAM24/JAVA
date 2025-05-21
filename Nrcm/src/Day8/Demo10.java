package Day8;

public class Demo10 implements Runnable {
	public void run() {
		System.out.println("hii");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new Demo10());
		t1.start();

	}

}
