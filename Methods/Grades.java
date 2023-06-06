package Methods_Lab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        printGrade(grade);

    }

    public static void printGrade(double gradeGiven) {
        if (gradeGiven >= 2 && gradeGiven < 3) {
            System.out.println("Fail");
        }else if (gradeGiven >= 3 && gradeGiven <= 3.49) {
            System.out.println("Poor");
        }else if (gradeGiven >= 3.50 && gradeGiven <= 4.49) {
            System.out.println("Good");
        }else if (gradeGiven >= 4.50 && gradeGiven < 5.49) {
            System.out.println("Very good");
        }else {
            System.out.println("Excellent");
        }
    }
}
