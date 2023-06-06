package FinalExam;

import java.util.Scanner;

public class PasswordValidator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Complete")) {
            String[] inputArr = input.split("\\s+");
            String action = inputArr[0];

            switch (action) {
                case "Make":
                    String command = inputArr[1];
                    int index = Integer.parseInt(inputArr[2]);
                    String firstPart = password.substring(0, index);
                    String secondPart = password.substring(index + 1);
                    if (command.equals("Upper")) {

                        String indexToReplace = password.substring(index, index + 1).toUpperCase();
                        password = firstPart + indexToReplace + secondPart;
                        System.out.println(password);
                    } else if (command.equals("Lower")) {
                        String indexToReplace = password.substring(index, index + 1).toLowerCase();
                        password = firstPart + indexToReplace + secondPart;
                        System.out.println(password);
                    }
                    break;

                case "Insert":

                    int indexToInsert = Integer.parseInt(inputArr[1]);
                    String charToInsert = inputArr[2];
                    if (indexToInsert >= 0 && indexToInsert < password.length()) {
                        String partOne = password.substring(0, indexToInsert);
                        String partTwo = password.substring(indexToInsert);
                        password = partOne + charToInsert + partTwo;
                        System.out.println(password);
                        break;
                    }
                case "Replace":

                    char charToReplace = inputArr[1].charAt(0);

                    if (password.contains(String.valueOf(charToReplace))) {
                        StringBuilder newPassword = new StringBuilder();

                        int value = Integer.parseInt(inputArr[2]);
                        int newChar = charToReplace + value;
                        char newSymbol = (char) newChar;

                        for(char symbol : password.toCharArray()){
                            if(symbol == charToReplace){
                                newPassword.append(newSymbol);
                            }else {


                                newPassword.append(symbol);
                            }
                        }

                        System.out.println(newPassword);
                        password = newPassword.toString();
                    }
                    break;

                case "Validation" :
                    if(password.length() < 8){
                        System.out.println("Password must be at least 8 characters long!");
                    }
                    if (onlyLettersAndSymbols(password)) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }

                    if(checkForUpperCase(password)){
                        System.out.println("Password must consist at least one uppercase letter!");
                    }
                    if(checkForLowerCase(password)){
                        System.out.println("Password must consist at least one lowercase letter!");
                    }
                    if(checkForDigit(password)) {
                        System.out.println("Password must consist at least one digit!");
                    }

                    break;
            }

            input = scanner.nextLine();

        }


    }

    private static boolean checkForDigit(String password) {
        for (char symbol : password.toCharArray()) {
            if( Character.isDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkForLowerCase(String password) {
        for (char symbol : password.toCharArray()) {
            if( Character.isLowerCase(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkForUpperCase(String password) {
        for (char symbol : password.toCharArray()) {
            if( Character.isUpperCase(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean onlyLettersAndSymbols(String word) {

        for(char symbol : word.toCharArray()){

            if (!(Character.isLetterOrDigit(symbol) && symbol != '_')){
               return true;
            }

        }
        return false;

    }

}
