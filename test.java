package sino;
import java.util.*;

public class test {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        List newUserList = new ArrayList();

        List users = new ArrayList();
        users.add("michael");
        users.add("michael");
        users.add("jim");
        users.add("dwight");

//        ArrayList<String> values = ... //Your values
        HashSet<String> uniqueUsers = new HashSet<>(users);
        for (String user : uniqueUsers) {
            newUserList.add(user);
        }
        System.out.println(newUserList.toString());
        System.out.println(newUserList.get(1).toString());
        int j = 0;
        while ( j < newUserList.size()) {
//            System.out.println();
            System.out.println(newUserList.get(j).toString() + " has " + greetedUser(users, newUserList.get(j).toString()) + " appearances.");
            j += 1;
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
}
