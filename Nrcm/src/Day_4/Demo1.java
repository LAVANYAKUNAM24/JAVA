package Day_4;
class FixedAmount{
	public int fixedAmount=10000;
}
abstract class Withdrawal{
	abstract void withdraw(int amount);
}

public class Demo1 extends Withdrawal {
	FixedAmount f1=new FixedAmount();
	void withdraw(int amount) {
		System.out.println("Withdrawn:" + amount);
		System.out.println("AvailableBalance:"+ f1.fixedAmount);
		
	}
	public static void main(String[] args) {
		int amount=Integer.parseInt(args[0]);
		Demo1 d=new Demo1();
		d.withdraw(amount);
		
	}
	
		
	}


