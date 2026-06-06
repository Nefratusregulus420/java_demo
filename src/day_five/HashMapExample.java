package day_five;
import java.util.HashMap;
public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> student = new HashMap<Integer,String>();
		
		student.put(1,"Ankush");
		student.put(2,"Gana");
		student.put(3,"Harsh");
		System.out.println(student);
		System.out.println(student.containsKey(4));
		
		System.out.println(student.containsValue("Ankush"));
		System.out.println(student.size());
		System.out.println(student.get(2));
	}

}
