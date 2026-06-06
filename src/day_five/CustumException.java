package day_five;

public class CustumException{
	public static void vote(int age) {
		if(age<18) {
			throw new AgeException("cannot vote");
		}
		System.out.println("voted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			vote(9);
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}

	}

}
