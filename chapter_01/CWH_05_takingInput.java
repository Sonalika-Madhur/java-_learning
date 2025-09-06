package chapter_01;

import java.util.Scanner;

public class CWH_05_takingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print(" Enter nuber 2:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number is " + sum);

    }

}
