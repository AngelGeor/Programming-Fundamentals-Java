package BasicSyntaxConLoops_Ex;

import java.util.Scanner;

public class vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double totalPrice = 0;
        switch (typeOfPeople) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    totalPrice = numberOfPeople * 8.45;
                }else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = numberOfPeople * 9.80;
                }else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = numberOfPeople * 10.46;
                }
                if (numberOfPeople >= 30) {
                    totalPrice = totalPrice - (totalPrice * 0.15);
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    totalPrice = numberOfPeople * 10.90;
                    if (numberOfPeople >= 100) {
                        totalPrice = totalPrice - (10 * 10.90);
                    }
                }else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = numberOfPeople * 15.60;
                    if (numberOfPeople >= 100) {
                        totalPrice = totalPrice - (10 * 15.60);
                    }
                }else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = numberOfPeople * 16.0;
                    if (numberOfPeople >= 100) {
                        totalPrice = totalPrice - (10 * 16.0);
                    }
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    totalPrice = numberOfPeople * 15;
                }else if (dayOfWeek.equals("Saturday")) {
                    totalPrice = numberOfPeople * 20;
                }else if (dayOfWeek.equals("Sunday")) {
                    totalPrice = numberOfPeople * 22.50;
                }
                if (numberOfPeople >= 10 && numberOfPeople <=20) {
                    totalPrice = totalPrice - (totalPrice * 0.05);
                }
                break;

        }

        System.out.printf("Total price: %.2f", totalPrice );
    }
}
