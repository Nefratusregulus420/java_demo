package day_five;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExceptionExample {
	
	public static void FileRead() throws IOException{
		FileReader fr = new FileReader("Filer.txt");
		System.out.println("test");
	}

	public static void main(String[] args) {
		try {
			FileRead();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
