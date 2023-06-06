package Methods_Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());

        double output = Power(number,power);
        DecimalFormat dc = new DecimalFormat("0.####");


        System.out.println(dc.format(output));

    }
    public static double Power(double number, int power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
          result = result * number;
        }
        return result;
    }

}
