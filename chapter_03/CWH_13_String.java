package chapter_03;

import java.util.*;
import java.util.Scanner;

public class CWH_13_String {
    public static void main(String[] args) {
        // String name = new String("harry");
        String name = "harry";
        System.out.println(name);
        // string are immutable
        // “cannot be changed after creation.”
        int a = 6;
        float b = 5.5f;
        System.out.printf("The value of a is %d and value of b is %.2f \n", a, b);
        // System.out.println("The value of a is " + a + " and value of b is " + b);
        System.out.format(" a = %d and b = %f", a, b);
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        System.out.println(c);
    }

}
