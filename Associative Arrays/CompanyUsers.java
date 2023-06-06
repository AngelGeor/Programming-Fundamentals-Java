package AssociativeArrays_Ex;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companies = new TreeMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String id = input.split(" -> ")[1];

            if(!companies.containsKey(companyName)) {
                companies.put(companyName,new ArrayList<>());
            }

            if(!companies.get(companyName).contains(id)){
                companies.get(companyName).add(id);
            }


            input = scanner.nextLine();
        }
        companies.forEach((key,value) -> {
            System.out.println(key);
            value.forEach(id -> System.out.println("-- " + id));
        });
    }
}
