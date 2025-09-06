package chapter_5.Practice;

public class P1_pattern {
    public static void main(String[] args) {
        // problrm 1 // patttern
        // int n = 4;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");

        // }
        // System.out.println();

        // }

        // problem 2 sum
        // int sum = 0;
        // int n = 4;
        // int i = 0;
        // while (i < n) {
        // sum = sum + (2 * i);

        // i++;

        // }

        // for (int i = 0; i < n; i++) {
        // sum = sum + (2 * i);

        // }
        // System.out.print("sum first evennumber: ");
        // System.out.println(sum);

        // problem 3 table
        // int m = 3;
        // for (int i = 1; i <= 10; i++) {
        // int multiplication = m * i;
        // System.out.println(multiplication);

        // }
        // problem 4
        // int m = 3;
        // for (int i = 10; i > 0; i--) {
        // int multiplication = m * i;
        // System.out.printf("%d X %d = %d\n", n, i, multiplication);

        // }
        // problem 5
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            // factorial n! = n*(n-1)*(n-2)*(n-3)....1
            // special case 0!= 1
            // 5!= 5*4*3*2*1
            // factorial = factorial * i;
            factorial *= i;

        }
        System.out.printf("factorial of %d is %d ", n, factorial);
        System.out.println();

    }

}
