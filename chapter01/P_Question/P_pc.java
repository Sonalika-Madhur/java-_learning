package chapter01.P_Question;

import java.util.Scanner;

public class P_pc {
    public static void main(String[] args) {
        System.out.println("Marks of the student in 5 subjects");
        Scanner sc = new Scanner(System.in);
        System.err.print("physics: ");
        int sub1 = sc.nextInt();
        System.out.print("chemistry: ");
        int sub2 = sc.nextInt();
        System.out.print("maths: ");
        int sub3 = sc.nextInt();
        System.out.print("english: ");
        int sub4 = sc.nextInt();
        System.out.print("computer: ");
        int sub5 = sc.nextInt();
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        float percentage = (total / 500.0f) * 100;
        System.out.println("The percentage of the student is " + percentage + "%");
    }

}
