package Methods_Ex;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        //проверка за дължина -> [6; 10]
        boolean isPasswordValidLength = isValidLength(password); //true -> валидна; false -> не е валидна
        if (!isPasswordValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //проверка за съдържанието -> само букви и цифри
        boolean isValidPasswordContent = isValidContent(password); //true (валидна), false (невалидна)
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        //проверка за брой на цифирите -> минимум 2
        boolean isValidPasswordCountDigits = isValidCountDigits(password);  //true (валидна), false (невалидна)
        if (!isValidPasswordCountDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        //валидна: isPasswordValidLength = true и isValidPasswordContent = true и isValidPasswordCountDigits = true
        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigits) {
            System.out.println("Password is valid");
        }

    }

    //метод за валидиране на дължината -> true (валидна); false (невалидна)
    private static boolean isValidLength(String password) {

        return password.length() >= 6 && password.length() <= 10;
    }

    //метод за валидиране на съдържанието -> true (валидна), false (невалидна)
    private static boolean isValidContent(String password) {
        //всички символи да са буква или цифра -> "T@st1234"
        //обхождаме всички символи
        //ако даден символ не е буква или цифра -> false
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    //метод за валидиране на брой на цифрите -> валидна парола: брой >= 2
    private static boolean isValidCountDigits(String password) {

        int count = 0; //брой на цифрите
        //обхождам всеки един символ -> проверка дали е цифра -> увеличавам броя
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }

        return count >= 2;


    }
    }


