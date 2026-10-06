import java.util.Scanner;

public class IT24102666Lab9Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double assignmentMark;
        double examMark;
        double finalMark;
        String stdName;
        char grade;
        String[] studentName = new String[5];
        double[] studentMark = new double[5];
        char[] studentGrade = new char[5];

        for (int i = 0; i < studentName.length; i++) {
            System.out.print("Enter Student Name: ");
            stdName = input.next();
            studentName[i] = stdName;

            System.out.print("Enter Assignment Mark (out of 100): ");
            assignmentMark = input.nextDouble();

            if (assignmentMark > 100 || assignmentMark < 0) {
                System.out.println("Invalid Assignment Mark! Try Again");
                i--;
                continue;
            }

            System.out.print("Enter Exam Mark (out of 100): ");
            examMark = input.nextDouble();

            if (examMark > 100 || examMark < 0) {
                System.out.println("Invalid Exam Mark! Try Again");
                i--;
                continue;
            }

            finalMark = calcFinalMark(assignmentMark, examMark);
            studentMark[i] = finalMark;
            grade = findGrade(finalMark);
            studentGrade[i] = grade;
            System.out.println();
        }

        printDetails(studentName, studentMark, studentGrade);

        input.close();
    }

    public static double calcFinalMark(double asignmtMrk, double examMrk) {
        return asignmtMrk * 0.3 + examMrk * 0.7;
    }

    public static char findGrade(double finalMark) {
        if (finalMark <= 100 && finalMark >= 75) {
            return 'A';
        } else if (finalMark < 75 && finalMark >= 60) {
            return 'B';
        } else if (finalMark < 60 && finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String[] studentName, double[] studentMark, char[] studentGrade) {
        System.out.printf("%-10s     %-10s     %-10s%n", "Name", "Final Mark", "Grade");
        System.out.println("---------------------------------------");

        for (int i = 0; i < studentName.length; i++) {
            System.out.printf("%-10s     %-10.2f     %-10c%n", studentName[i], studentMark[i], studentGrade[i]);
        }
    }
}
