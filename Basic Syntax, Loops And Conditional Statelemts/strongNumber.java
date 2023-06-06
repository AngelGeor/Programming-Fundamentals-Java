package BasicSyntaxConLoops_Ex;

import java.util.Scanner;

public class strongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sumFac = 0;
        int starNum = number;
         while (number != 0) {
             int lastDigit = number % 10;
             int fact = 1;
             for (int i = 1; i <= lastDigit ; i++) {
                 fact = fact * i;
             }
             sumFac = sumFac + fact;
             number = number / 10;
         }

         if (starNum == sumFac) {
             System.out.println("yes");
         }else {
             System.out.println("no");
         }

    }
}
