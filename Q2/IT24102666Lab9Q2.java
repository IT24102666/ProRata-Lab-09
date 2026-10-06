import java.util.Scanner;
public class IT24102666Lab9Q2 {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the Radius: ");
		double radius = input.nextDouble();

		double circleArea = circleArea(radius);

		System.out.print("Area of the Circle: " + circleArea);
	}

	public static double circleArea (double radius) {
		double areaOfCircle = 3.14 * Math.pow(radius, 2);
		return areaOfCircle;
	}

}