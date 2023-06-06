package DataTypes_Ex;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());

        double deviation = 0.000001;

        if (Math.abs(numberA - numberB) > 0.000001 ) {
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}
