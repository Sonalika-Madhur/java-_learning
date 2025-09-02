package chapter_02.cwh_12_ps2;

import java.util.Scanner;

public class type_casting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println(a);
        a = (char) (a - 5);
        System.out.println("The value of b is " + a);
        sc.close();
    }

}
