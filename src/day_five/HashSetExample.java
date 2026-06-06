package day_five;
import java.util.HashSet;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> marks = new HashSet<Integer>();
		
		marks.add(45);
		marks.add(45);
		marks.add(90);
		System.out.println(marks);
		System.out.println(marks.contains(45));
		marks.remove(45);
		System.out.println(marks);
		System.out.println(marks.size());
	}

}
