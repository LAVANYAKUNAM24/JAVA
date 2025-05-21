package Day7;
class LavanyaException extends Exception{
	public LavanyaException(String message) {
		super(message);
	}
	
}
public class Demo8 {
	public static void checkNum(int num) throws LavanyaException {
		if(num%2==0) {
			throw new LavanyaException("nak maths occhu");
		}else {
			System.out.println("naku maths radu");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkNum(12);
		}catch(LavanyaException e) {
			System.out.println(e.getMessage());
		}

	finally {
		System.out.println("edi emaina naku maths ochuu");
	}
}}
