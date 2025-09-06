package chapter_5;

import java.util.Scanner;

public class Do_while_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int i = sc.nextInt();

        // its enter the loop without checking condition
        // it is graranted to execute at least once
        do {
            System.out.println(i);
            i++;

        } while (i < 5);

    }

}
