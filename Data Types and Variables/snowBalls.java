package DataTypes_Ex;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfBalls = Integer.parseInt(scanner.nextLine());
        double highestValue = Double.MIN_VALUE;
        int highestSnow = Integer.MIN_VALUE;
        int highestTime = Integer.MIN_VALUE;
        int highestQuality = Integer.MIN_VALUE;

        for (int i = 1; i <= numberOfBalls ; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow (( snowballSnow / snowballTime), snowballQuality) * 1.0;

            if (snowballValue > highestValue) {

                highestValue = snowballValue;
                highestTime = snowballTime;
                highestSnow = snowballSnow;
                highestQuality = snowballQuality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)",highestSnow, highestTime, highestValue, highestQuality );

    }

}
