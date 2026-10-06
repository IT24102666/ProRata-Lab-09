import java.util.Scanner;

public class IT24102666Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double A;
        double B;
        double C;
        double quadEqPlus;
        double quadEqMinus;

        System.out.println("Enter Value for A: ");
        A = input.nextDouble();
        System.out.println("Enter Value for B: ");
        B = input.nextDouble();
        System.out.println("Enter Value for C: ");
        C = input.nextDouble();

        double dis = (Math.pow(B, 2) - 4 * A * C);

        if (dis < 0) {
            System.out.println("The equation has no real roots.");
        } else {
            quadEqPlus = (-B + Math.sqrt(dis)) / (2 * A); 
            quadEqMinus = (-B - Math.sqrt(dis)) / (2 * A);

            System.out.println("Root 1: " + quadEqPlus + "\nRoot 2: " + quadEqMinus);
        }
    }
}