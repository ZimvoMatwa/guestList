package sino;

import java.util.*;

public class greetings {
    /*
    greet = username + language to greet in
    greeted = all greeted users + time each has been greeted
    counter = list of unique users
    clear = deletes greetings + user info. clear + name deletes counter for the user
    exit = exits app
    */
    static Boolean exit = true;
    static List lwimi = new ArrayList<String>();
    static List users = new ArrayList<String>();
    static List newUserList = new ArrayList();

    String userLanguage;
    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {


        while (exit) {
            int i = 0;
            System.out.println("1. greet 'greet [name] in [language]' \n2. check who's been greeted 'greeted' or 'greeted [name]' \n3. clear the guest list 'clear' \n4. count numbers of greeted people 'count' \n5. leave programme 'exit'");
            String userInput = s.nextLine().toLowerCase();
            String words[] = userInput.split(" ");

            for(String token : words) {
//                System.out.println(token);
                i += 1;
            }

            if (words[0].equals("greet") && i >= 2) { //we could remove "in" from the input and have this equate to 2
                if (i <= 2) {
                    greet(words[1], "");
                    users.add(words[1]);
                } else if (i >= 4) {
                    greet(words[1], words[3]);
                    users.add(words[1]);
                    lwimi.add(words[3]);
                }

            }
            else if(words[0].equals("greeted")) {
//                System.out.println(i);
                switch(i) {
                    case 1:
                        greetedAll(users);
                        break;
                    case 2:
                        System.out.println(words[1] + " has been greeted " + greetedUser(users, words[1]) + " time(s)");
                        break;
                }
            }
            else if(words[0].equals("clear")) {
                users.clear();
                lwimi.clear();
                System.out.println("All information Cleared");
            }
            else if (userInput.equals("exit")) {
                System.out.println("Auf Wiedersehen");
                exit();
            }
            else if (words[0].equals("count")) {
                counter(users);
            } else { //none of the above arguments are met
                System.out.println("Please separate words with space e.g. greet Sino in isiXhosa");
            }

        }
    }

    //THE METHODS
    static void greet(String name, String lan) {
        switch (lan) {
            case "isixhosa":
                System.out.println("Mholo, " + name);
                break;
            case "isizulu":
                System.out.println("Sawubona, " + name);
                break;
            case "sesotho":
                System.out.println("Dumela, " + name);
            default:
                System.out.println("Hello, " + name);
        }
    }

    static int greetedUser(List allUsers, String userName) {
        int i = 0;
        int counter = 0;

        while (i < allUsers.size()) {
            if (allUsers.get(i).toString().equals(userName)) {
                counter += 1;
            }
            i += 1;
        }

        return counter;
    }

    static void greetedAll(List myUsers) {
        HashSet<String> uniqueUsers = new HashSet<>(myUsers);
        for (String user : uniqueUsers) {
            newUserList.add(user);
        }

        if (newUserList.size() > 0) {
            int j = 0;
            while (j < newUserList.size()) {
//            System.out.println();
                System.out.println(newUserList.get(j).toString() + " has " + greetedUser(myUsers, newUserList.get(j).toString()) + " appearance(s).");
                j += 1;
            }
        } else {
            System.out.println("no greetings have been logged");
        }
        newUserList.clear();
    }

    static void counter(List themUsers) {
        HashSet<String> uniqueUsers = new HashSet<>(themUsers);
        for (String user : uniqueUsers) {
            newUserList.add(user);
        }
        System.out.println("There are " + newUserList.size() + " greeted user(s).");
        newUserList.clear();
    }

    static boolean exit() {
        return exit = false;
    }
}