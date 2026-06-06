package day_two;
import java.util.Scanner;
public class MonthNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Month number : ");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Febraury");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("june");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Enter a valid Month number from 1 to 12");
		}
		sc.close();
		

	}

}
