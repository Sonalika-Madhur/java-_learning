package Chapter_04;

import java.util.Scanner;

public class Cwh_19_Switch {
    public static void main(String[] args) {
        // Switch
        System.out.print("Enter Your age ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch (age) {
            case 30:
                System.out.println("You are going to become an Adult");
                break;
            case 23:
                System.out.println("You are going to join a job");
                break;
            default:
                System.out.println("Enjoy your life");

        }
    }

}
