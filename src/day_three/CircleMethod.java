package day_three;
import java.util.Scanner;
public class CircleMethod {
	static double circleArea(double a) {
		double pi=3.14;
		return pi*a*a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an radius value to find the circle area : ");
		double area=sc.nextDouble();
		System.out.println("The area is "+circleArea(area));
		sc.close();
	}
}
