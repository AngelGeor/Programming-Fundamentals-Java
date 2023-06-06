package BasicSyntaxConLoops_Ex;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String pass = "";
        int counter = 0;

        for (int position = userName.length() - 1; position >= 0 ; position--) {
            char CurrentSym = userName.charAt(position);
            pass += CurrentSym;
        }

        String enteredPass = scanner.nextLine();

        while (!enteredPass.equals(pass)) {

            counter++;
            if (counter >= 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }
        if (enteredPass.equals(pass))
        System.out.printf("User %s logged in.", userName);

    }
}
