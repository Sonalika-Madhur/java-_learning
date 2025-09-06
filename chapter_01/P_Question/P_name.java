package chapter_01.P_Question;

import java.util.Scanner;

public class P_name {
    public static void main(String[] args) {
        System.out.print("Enter your name ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name + " have a good day");

    }

}
