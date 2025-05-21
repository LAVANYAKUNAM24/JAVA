package Day8;
public class Demo9 extends Thread {
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
			if(i==5) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		Demo9 d1=new Demo9();
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
			d1.start();
		}
		
	
}
