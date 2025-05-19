package Day_4;

public class Demo8 {
	int x;
	int y;
	public Demo8(int x,int y) {
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
	public Demo8(Demo8 d1) {
		this.x=d1.x;
		this.y=d1.y;
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		Demo8 d1=new Demo8(55,66);
		Demo8 d2=new Demo8(d1);
		
	}

}
