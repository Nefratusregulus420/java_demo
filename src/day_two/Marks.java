package day_two;
import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of subject 1 : ");
		double s1 = sc.nextDouble();
		System.out.print("Enter the marks of subject 2 : ");
		double s2 = sc.nextDouble();
		double avg = (s1+s2)/2;
		if (avg >= 50) {
			System.out.println("pass with avg :"+avg);
		}else {
			System.out.println("fail with avg :"+avg);
		}
		if (avg >= 90) {
			System.out.println("Candidate scored Grade A");
		}
		 else if(avg >= 80) {
			System.out.println("Candidate scored Grade B");
		}
		 else {
			System.out.println("Candidate scored Grade C");
		 }
		sc.close();

	}

}
