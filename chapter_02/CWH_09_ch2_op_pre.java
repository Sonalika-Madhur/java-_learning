package chapter_02;

public class CWH_09_ch2_op_pre {

    public static void main(String[] args) {
        int a = 6 * 5 - 34 / 2;
        // steps: 6*5=30 , 34/2=17 , 30-17=13
        /*
         * 30 - 34 / 2
         * 30 - 17
         * 13
         */
        System.out.println(a);
        int b = 60 / 5 - 34 * 2;
        System.out.println(b);
        // steps: 60/5=12 , 34*2=68 , 12-68=-56
        // precedence and associativity
        // Left to Right --> associativity for *, / , %
        // Left to Right --> associativity for + , -
        // right to Left --> associativity for = , ++ , --

    }
}