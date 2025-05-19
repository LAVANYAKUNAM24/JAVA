package Day_4;

public class Demo9 {
	int x;
	int y;
	int z;
	public Demo9() {
		System.out.println("WELCOME TO MY PROFILE:K.LAVANYA");
	}
	public Demo9(int x) {
		this.x=x;
		System.out.println("SSC:"+(x));
	}
	public Demo9(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println("SSC:" + (x)+" INTER:"+(y));
	}
	public Demo9(int x,int y,int z) {
		this.x=x;
		this.y=y;
		this.z=z;
		System.out.println("SSc:"+(x) + " INTER:" +(y) + " BTECH:"+(z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9 d1=new Demo9();
		Demo9 d2=new Demo9(100);
		Demo9 d3=new Demo9(100,836);
		Demo9 d4=new Demo9(100,836,79);
		

	}

}
