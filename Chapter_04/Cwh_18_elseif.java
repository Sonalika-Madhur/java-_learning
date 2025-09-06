package Chapter_04;

import java.util.Scanner;

public class Cwh_18_elseif {

    public static void main(String[] args) {
        System.out.print(" Enter the Age = ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 56) {
            System.out.println(" you are experienced");
        } else if (age > 46) {
            System.out.println("You are semi experienced");
        } else if (age > 36) {
            System.out.println(" you are semi- semi experienced");
        } else {
            System.out.println("You are not Experienced");
        }
    }

}
