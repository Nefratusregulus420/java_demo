package first;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r = sc.nextInt();
        double pi = 3.14;
        double area = pi * r * r;
        System.out.println("The Area of the circle is: " + area);
        sc.close();
    }
}
