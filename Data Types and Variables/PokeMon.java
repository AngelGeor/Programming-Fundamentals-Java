package DataTypes_Ex;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBetweenTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int count  = 0;
        int initialPower = pokePowerN;

        while (pokePowerN >= distanceBetweenTargetsM) {
            pokePowerN = pokePowerN - distanceBetweenTargetsM;
            count ++;

            if (pokePowerN == initialPower * 0.5 && exhaustionFactorY != 0) {
                pokePowerN = pokePowerN / exhaustionFactorY;
            }



        }
        System.out.println(pokePowerN);
        System.out.println(count);

    }
}
