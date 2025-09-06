package Chapter_06.Practice_set;

public class Problem_06 {
    public static void main(String[] args) {
        // prolem 1
        // float sum = 0;
        // float[] a = { 95.9f, 87.0f, 92.7f, 99.8f };
        /*
         * for (int i = 0; i < a.length; i++) {
         * sum += a[i];
         * 
         * }
         * System.out.printf("Sum = %.2f", +sum);
         * System.out.println();
         */
        // problem 1 --> second method
        // for (float value : a) {
        // sum += value;

        // }
        // System.out.printf("Sum = %.2f", +sum);

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

    }

}
