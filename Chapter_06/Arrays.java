package Chapter_06;

public class Arrays {
    public static void main(String[] args) {
        // int[] marks = new int[5];
        // marks[0] = 100;
        // marks[1] = 100;
        // marks[2] = 90;
        // marks[3] = 80;
        // marks[4] = 70; // overwrite
        // marks[4] = 56;
        // System.out.println(marks[3]);

        // Declaration, | int[]marks;
        // Memory Allocation, | marks = new int[5];

        // declaration + Memory allocation, | int[]marks = new int[5];
        // declare+initialize, | int[]marks = {100,70,80,71,98}
        // Array indices starts from 0 and goes till (n-1) where n is the size of the
        // array
        int[] marks = { 100, 90, 80, 70, 85 };
        System.out.println(marks[2]);

    }

}
