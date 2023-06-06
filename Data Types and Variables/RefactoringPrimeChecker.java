package DataTypes_Ex;

import java.util.Scanner;

public class RefactoringPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;

        int number = Integer.parseInt(scanner.nextLine());
        for (int n = 2; n <= number ; n++) {
            if ( n % 2 == 0 || n % 3 == 0) {
                isPrime = false;

            }
            if (isPrime) {
                System.out.printf("%d -> true%n", n);
            }else {
                System.out.printf("%d -> false%n", n);
            }
        }


        }
    }

