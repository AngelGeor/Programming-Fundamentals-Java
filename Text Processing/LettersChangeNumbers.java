package TextProcessing_Ex;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] passwords = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String password : passwords) {
            //presmetnem stoinostta na chisloto
            double modifiedNumber = getModifiedNumber(password);

            //dobavqme chisloto ot parolata kym sumata
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f",totalSum);
    }

    private static double getModifiedNumber(String password) {
        //{bukva}{chislo}{bukva} -- "P34562Z"
        char firstLetter = password.charAt(0); //'P'
        char secondLetter = password.charAt(password.length() - 1); //'Z'

        //Vzimane na chisloto
        //Purvi nachin
        StringBuilder builder = new StringBuilder(password);
        double number = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length() - 1).toString());

        //Vtori nachin:

        //double number1 =Double.parseDouble(password.replace(firstLetter,' ').replace(secondLetter, ' ').trim());

        //Treti nachin
        //double number1 = Double.parseDouble(password.substring(1, password.indexOf(secondLetter)));

        //Proverka za pyrva bukva:

        if(Character.isUpperCase(firstLetter)) {
            //Chisloto = chisloto / poziciqita na glavnata bukvata v azbukata
            int positionUpperLetter = (int)firstLetter - 64; // ASCII koda - 64;
                    number = number / positionUpperLetter;
        }else{
            //Chisloto = chisloto * poziciqta na malkata bukvata v azbukata
            int positionLowerLetter = (int)firstLetter - 96; //ASCII koda - 96
            number = number * positionLowerLetter;
        }

        // Proverka za vtora bukva
        if(Character.isUpperCase(secondLetter)) {
            //Chisloto = chisloto - poziciqita na glavnata bukvata v azbukata
            int positionUpperLetter = (int) secondLetter - 64; // ASCII koda - 64;
            number = number - positionUpperLetter;
        }else {
            //Chisloto = chisloto + poziciqta na malkata bukvata v azbukata
            int positionLowerLetter = (int)secondLetter - 96; //ASCII koda - 96
            number = number + positionLowerLetter;
        }

        return number;
    }
}
