package Chapter_06.Practice_set;

public class Problem_06 {
    public static void main(String[] args) {
        // prolem 1
        // SUM OF ARRAY
        float sum = 0;
        float[] b = { 95.9f, 87.0f, 92.7f, 99.8f };
        /*
         * for (int i = 0; i < a.length; i++) {
         * sum += a[i];
         * 
         * }
         * System.out.printf("Sum = %.2f", +sum);
         * System.out.println();
         */
        // problem 1 --> second method
        for (float value : b) {
            sum += value;
        }
        System.out.printf("Sum = %.2f", +sum);
        System.out.println();

        // PROBLEM 2
        // CHECK THE NUMBER IS PRESENT IN THE ARRAY
        float[] a = { 95.9f, 87.0f, 92.7f, 99.8f };
        float num = 92.78f;
        boolean isInarray = false;
        for (float element : a) {
            if (num == element) {
                isInarray = true;
                break;
            }
        }
        if (isInarray) { //
            System.out.println("the value is present in the array");
        } else {
            System.out.println("the value is not present in the array");
        }

        // Problem 3
        // average marks from array
        float[] marks = { 89.9f, 80, 97, 96.5f, 88.8f };
        float sum1 = 0;
        for (float value : marks) {
            sum1 += value;

        }
        System.out.println("The value of average is " + sum1 / marks.length);

        // problem 4
        // 2X3 matrix (2 row , 3 Column)
        int[][] mat1 = {
                { 1, 2, 3 }, // row 1
                { 4, 5, 6 } // row 2
        };

        // Printing matrix

        for (int i = 0; i < mat1.length; i++) { // rows
            for (int j = 0; j < mat1[i].length; j++) { // column
                // mat1[i].length --> the number of elements(columns) in row
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }

}
