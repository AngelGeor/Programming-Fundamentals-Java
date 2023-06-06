package DataTypes_Ex;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());


        int sum = 0;
        int capacity = 255;

        for (int i = 1; i <= numberOfLines ; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());

            sum += quantities;


            if (sum > capacity) {

                System.out.println("Insufficient capacity!");
                sum = sum - quantities;
            }
        }

        System.out.println(sum);
    }
}
