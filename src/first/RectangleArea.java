package first;
import java.util.Scanner;
public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double l= sc.nextDouble();
		System.out.print("Enter the Breadth: ");
		double b= sc.nextDouble();
		double area=l*b;
		System.out.print("The area of Rectangle is :"+area);
		sc.close();
	}

}
