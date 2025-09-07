package Chapter_06;

public class multi_dim_arrays {
    public static void main(String[] args) {
        int[] marks; // A 1-D Array
        int[][] flats; // A 2-D Array
        // Displaying the 2-D Array(for loop)
        flats = new int[2][3]; // int[row][column]
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j] + " ");
            }
            System.out.println();
        }
        // 3-D Array
        String[][][] arr;
        // String[][][] arr = new String[2][3][4];

    }

}
