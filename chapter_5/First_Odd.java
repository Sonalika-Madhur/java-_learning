package chapter_5;

public class First_Odd {
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        // if (i % 2 != 0) {
        // System.out.println("First odd number " + i);
        // }
        // }

        // 2n = Even Number = 0, 2, 4,6
        // 2n+1 = odd number = 1,3,5,7

        // first odd number
        // int a = 5;
        // for (int n = 0; n <= a; n++) {
        // System.out.println(2 * n + 1);

        // }

        // decrementing for loop

        // for (int i = 5; i > 0; i--) {
        // System.out.println(i);
        // }

        // break and constinue using loops

        // for (int i = 0; i < 5; i++) {
        // System.out.println(i);
        // System.out.println("Java is great ");
        // if (i == 2) {
        // System.out.println("Ending the loop");
        // break;
        // }
        // }

        // int i = 0;

        // while (i < 5) {
        // System.out.println(i);
        // System.out.println("Java is great");
        // if (i == 2) {
        // System.out.println("End");
        // break;
        // }
        // i++;

        // }

        // do {
        // System.out.println(i);
        // System.out.println("Java is great");
        // if (i == 2) {
        // System.out.println("End");
        // break;
        // }
        // i++;

        // } while (i < 5);

        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great ");
        }

    }

}
