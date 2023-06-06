package BasicSyntaxConLoops_Ex;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int numberOfHeadsets = lostGames / 2;
        int numberOfMice = lostGames / 3;
        int numberOfKeyboards = lostGames / 6;
        int numberOfDisplays = lostGames / 12;

        double totalPrice = headsetPrice * numberOfHeadsets + mousePrice * numberOfMice + keyboardPrice * numberOfKeyboards +
                displayPrice * numberOfDisplays;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
