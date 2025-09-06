package chapter_5.Practice;

public class P1_pattern {
    public static void main(String[] args) {
        // problrm 1
        // int n = 4;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }

        // problem 2
        int sum = 0;
        int n = 4;
        int i = 0;
        while (i < n) {
            sum = sum + (2 * i);

            i++;

        }
        System.out.print("sum first evennumber: ");
        System.out.println(sum);
    }

}
