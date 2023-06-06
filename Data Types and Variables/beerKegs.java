package DataTypes_Ex;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfKegs = Integer.parseInt(scanner.nextLine());
        double result = 0;
        double isBiggest = 0;
        String biggestName = "";

        for (int i = 1; i <=numberOfKegs ; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            result = Math.PI * radius * radius * (height * 1.0);

            if (result > isBiggest) {
                isBiggest = result;
                biggestName = name;
            }
        }
        System.out.println(biggestName);
    }
}
