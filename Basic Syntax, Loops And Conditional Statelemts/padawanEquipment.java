package BasicSyntaxConLoops_Ex;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightSabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double LightSabersTotal = Math.ceil(numberOfStudents + 0.1 * numberOfStudents) * priceOfLightSabers;
        double robesTotal = numberOfStudents * priceOfRobes;
        double beltsTotal = (numberOfStudents - numberOfStudents / 6) * priceOfBelts;

        double totalSpend = LightSabersTotal + robesTotal + beltsTotal;

        if (totalSpend <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSpend);
        }else {
            System.out.printf("George Lucas will need %.2flv more.", totalSpend - budget);
        }



    }
}
