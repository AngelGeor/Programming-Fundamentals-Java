package MidExam;

import java.util.Scanner;

public class CookingMasterClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double flourPrice = Double.parseDouble(scanner.nextLine());
        double eggPrice = Double.parseDouble(scanner.nextLine());
        double apronPrice = Double.parseDouble(scanner.nextLine());
        int count = 0;

        double totalSum = 0;

        double totalPriceEggs = numberOfStudents * 10 * eggPrice;
        double totalPriceAprons = Math.ceil(numberOfStudents + (numberOfStudents * 0.2)) * apronPrice;
        if(numberOfStudents > 4) {
            count = numberOfStudents / 5;
        }
        double totalPriceFlour = (numberOfStudents - count) * flourPrice;

        totalSum = totalPriceEggs + totalPriceAprons + totalPriceFlour;

        if (totalSum > budget) {
            System.out.printf("%.2f$ more needed.",Math.abs(budget - totalSum));
        }else {
            System.out.printf("Items purchased for %.2f$.", totalSum);
        }
    }
}
