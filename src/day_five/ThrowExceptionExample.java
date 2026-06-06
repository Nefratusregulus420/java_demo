package day_five;

public class ThrowExceptionExample {
	public static void deposit(int amount) {
		if(amount<0) {
			throw new IllegalArgumentException();
			
		}
		else {
			System.out.println("we are inside");
		}
	}
	public static void main(String[] args) {
		try {
			deposit(-20);
		}
		catch(IllegalArgumentException e) {
			System.out.println("The error occured "+e.getMessage());
		}
		finally {
			System.out.println("finally is executed");
		}
		
		
	}

}
