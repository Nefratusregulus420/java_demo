package day_five;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		int i =0;
		int j=15;
		int result=0;
		String str=null;
		try {
		result=j/i;
		str.length();
		System.out.println("The division : "+result);
		
		}
		
		catch(ArithmeticException e) {
			System.out.println("The Error occured "+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("The Error occured "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("The Error occured "+e.getMessage());
		}
		finally {
			System.out.println("This will be executed always");
		}
		System.out.println("The program is over");

	}

}
