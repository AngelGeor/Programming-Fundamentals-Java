package FinalExam;

import java.util.*;

public class Followers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> nameComment = new TreeMap<>();
        Map <String, Integer> nameLikes = new TreeMap<>();

        while(!input.equals("Log out")){
            String[] inputArr = input.split("\\s+");
            String action = inputArr[0];
            switch (action){
                case "New follower:":
                    String username = inputArr[1];
                    nameComment.putIfAbsent(username,0);
                    nameLikes.putIfAbsent(username,0);
                    break;
                case "Like:":
                    String user = inputArr[1];
                    int count = Integer.parseInt(inputArr[2]);
                    if(nameLikes.containsKey(user)){
                        int currentLikes = nameLikes.get(user);
                        nameLikes.put(user, currentLikes + count);
                    }
                    nameLikes.putIfAbsent(user,count);
                    break;
                case "Comment:":
                    user = inputArr[1];
                    if(nameComment.containsKey(user)){
                        int currentNumber = nameComment.get(user);
                        nameComment.put(user, currentNumber + 1);
                    }else {
                        nameComment.put(user,1);
                    }

                    break;
                case "Blocked:":
                    user = inputArr[1];
                    if(nameComment.containsKey(user) && nameLikes.containsKey(user)){
                        nameComment.remove(user);
                        nameLikes.remove(user);
                    }else {
                        System.out.println(user + " doesn't exist.");
                    }

            }
          input = scanner.nextLine();
        }
        int followers = Math.max(nameComment.size(), nameLikes.size());
        System.out.println(followers + " followers");

        nameComment.entrySet().stream().sorted((el1 , el2) -> Integer.compare(el2.getValue(), el1.getValue()))
                .forEach(user -> {
                    String username = user.getKey();
                    int sum = nameComment.get(username) + nameLikes.get(username);
                    System.out.print(username + ": ");
                    System.out.printf("%d%n", sum);

                });

    }
}
