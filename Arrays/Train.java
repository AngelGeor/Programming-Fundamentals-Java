package Arrays_Ex;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int[] wagons = new int[numberOfWagons];

        for (int i = 0; i < numberOfWagons; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            wagons[i] = numberOfPeople;

        }

        for (int number : wagons) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
