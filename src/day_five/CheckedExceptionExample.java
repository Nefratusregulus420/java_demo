package day_five;
import java.io.FileReader;
public class CheckedExceptionExample {

	public static void main(String[] args) {
		try {
		FileReader ob = new FileReader("FIleio.txt");
		System.out.println("The File is read");
		}
		catch(Exception e) {
			System.out.println("Their are some error "+e.getMessage());
		}

	}

}
