package sino;

import java.util.Scanner;
import java.io.*;
import java.lang.*;

class testing {
    public static void main(String[] args)
    {
        // Declare the object and initialize with
        // predefined standard input object
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("name");
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        double buns = 2.222;

        // Consuming the leftover new line
        // using the nextLine() method
        sc.nextLine();

        // reading the complete line for the integer
        // and converting it to an integer
        System.out.println("age");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("other names");
        String fatherName = sc.nextLine();
        String motherName = sc.nextLine();

        // Print the values to check
        // if the input was correctly obtained.
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Father's Name: "
                + fatherName);
        System.out.println("Mother's Name: "
                + motherName);
    }
}