package Day_4;

public class Demo7 {
	int a;
	int b;
	public Demo7(int x,int y) {
		a=x;
		b=y;
		System.out.println(x+y);
	}
	public void add() {
		System.out.println(this.a-this.b);
	}
	public static void main(String[] args) {
		Demo7 d1= new Demo7(12,45);
		d1.add();
	}

}
