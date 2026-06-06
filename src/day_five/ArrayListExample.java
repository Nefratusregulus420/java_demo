package day_five;
import java.util.ArrayList;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Harsh");
		friends.add("Rudra");
		friends.add("Gopal");
		System.out.println(friends);
		System.out.println(friends.contains("Akash"));
		System.out.println(friends.size());
		System.out.println(friends.get(1));
		System.out.println(friends.set(2,"Ankitha"));
		System.out.println(friends);
		
	}

}
