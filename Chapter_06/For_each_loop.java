package Chapter_06;

public class For_each_loop {
    public static void main(String[] args) {
        // int
        int[] marks = { 56, 78, 65, 60 };
        // length of the array
        System.out.println("length of the array " + marks.length);
        System.out.printf("length of the array: %d\n", marks.length);
        System.out.println(marks[1]);
        // float
        float[] a = { 98.6f, 89, 79.9f, 87, 78.5f };
        System.out.println(a[0]);
        // string
        String[] b = { "sonalika", "prabhjot", "taniya" };
        // displaying the array (Naive way)
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);

        // displaying the array (for loop)
        // Array travers
        System.out.println("Printing using for loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        // displaying the array (for loop --> revese order)
        System.out.println("Printing using for loop in revese order");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.println(marks[i]);
        }
        // display the array (for each loop)
        System.out.println("printing using for-each-loop");
        for (String element : b) {
            System.out.println(element);
        }
        for (int element : marks) {
            System.out.println(element);
        }
    }

}
