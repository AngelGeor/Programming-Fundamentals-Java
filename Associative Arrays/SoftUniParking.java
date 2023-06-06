package AssociativeArrays_Ex;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class    SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String,String> parkingUsers = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];
            String name = input[1];

            switch (command) {
                case "register":
                    String licensePlate = input[2];
                    if(!parkingUsers.containsKey(name)){
                        parkingUsers.put(name,licensePlate);
                        System.out.printf("%s registered %s successfully%n", name, licensePlate);
                    }else {

                        System.out.printf("ERROR: already registered with plate number %s%n" ,licensePlate);
                    }
                    break;
                case "unregister":
                    if(!parkingUsers.containsKey(name)) {
                        System.out.println("ERROR: user " + name + " not found");
                    }else {
                        parkingUsers.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }
                    break;
            }
        }

        parkingUsers.forEach((name, license) -> System.out.println(name + " => " + license));
    }
}
