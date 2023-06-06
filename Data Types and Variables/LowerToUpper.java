package DataTypes;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0);

        if (symbol > 64 && symbol < 96) {
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }


    }
}
