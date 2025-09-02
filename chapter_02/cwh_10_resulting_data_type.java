package chapter_02;

public class cwh_10_resulting_data_type {
    public static void main(String[] args) {
        /*
         * int a = 654 + 6;
         * float b = 6.54f + 6;
         * 
         * System.out.println(a);
         * System.out.println(b);
         */
        // int + int = int // memory space of int is 4 bytes
        // float + int = float // memory space of float is 4 bytes
        // double + int = double // memory space of double is 8 bytes
        // double + float = double // memory space of long is 8 bytes
        // float + float = float
        // int + float = float
        // int + double = double
        // float + double = double
        // double + double = double
        // long + long = long
        // int + long = long
        // float + long = float
        // double + long = double

        // byte + short = int
        // byte + byte = int
        // short + short = int
        // short + int = int
        // char + char = int
        // char + int = int
        // char + float = float
        // char + double = double
        int i = 56;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
        // a++ --> first use the value and then increment
        // ++a --> first increment the value and then use it
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
        char ch = 'a';
        System.out.println(++ch);

    }

}
