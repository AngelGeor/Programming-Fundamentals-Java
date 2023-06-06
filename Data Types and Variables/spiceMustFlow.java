package DataTypes_Ex;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int totalAmountExtracted = 0;
        int crewConsumption = 26;


        while (startingYield >= 100) {


            int amountExtracted = startingYield - crewConsumption;
            totalAmountExtracted += amountExtracted;
            counter++;
            startingYield = startingYield - 10;

        }


        System.out.println(counter);
        if (totalAmountExtracted > 26) {
            totalAmountExtracted -= 26;
        }
        System.out.print(totalAmountExtracted);
    }

    }

