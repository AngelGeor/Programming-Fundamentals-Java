package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        // double area = areaResult(length,width);
        System.out.printf("%.0f", areaResult(width,length));

    }
    public static double areaResult(double width, double length) {
        double result = width * length;
        return result;
    }

}
