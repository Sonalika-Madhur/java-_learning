package Chapter_07;

public class methods_arr {
    public static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        x = 898; // ⚠️ this changes only local copy, not original

        return z;

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);
        System.out.println(a + " " + b);
        int a1 = 1;
        int b1 = 2;
        int c1;
        // if (a1 > b1) {
        // c1 = a1 + b1;

        // } else {
        // c1 = (a1 + b1) * 5;
        // }
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

    }

}
