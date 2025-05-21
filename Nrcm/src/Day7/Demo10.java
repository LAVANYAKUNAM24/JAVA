package Day7;

public class Demo10 extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d1= new Demo10();
		Thread t1=new Thread(d1);
		t1.start();
		System.out.println(d1.getName());
		System.out.println(d1.getState());

	}

}
