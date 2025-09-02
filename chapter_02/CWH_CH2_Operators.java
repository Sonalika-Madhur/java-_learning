package chapter_02;

public class CWH_CH2_Operators {
    public static void main(String[] args) {

        // = assignment operator
        int a = 4;
        // + , - , * , / , % arithmetic operators
        int b = 6 - a;
        int c = 6 * a;

        // ++ , -- increment and decrement operators
        ++a; // a = a - 1;
        b--; // b = b - 1;
        // difference between --a and a--
        // --a is pre decrement
        // in --a first a will be decremented and then the value will be used in the
        // expression
        // a-- is post decrement
        // in --a first a will be decremented and then the value will be used in the
        // expression
        // steps: a = 4 - 1 = 3
        // in a-- first the value will be used in the expression and then a will be
        // decremented
        int d = 6 % a; // output will be 2
        d += 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); // output will be 5
        // == , != , > , < , >= , <= relational operators

        System.out.println(6 == 4); // output will be false
        System.out.println(6 == 6); // output will be true
        System.out.println(6 != 4); // output will be true
        // && , || , ! logical operators
        System.out.println(6 > 4 && 6 > 5); // output will be true
        System.out.println(6 > 4 && 6 > 7);// output will be false
        System.out.println(6 > 4 || 6 > 7);// output will be true);
        System.out.println(!true); // output will be false
        System.out.println(!false); // output will be true
        // ! negation operator
        System.out.println(!(6 > 4)); // output will be false
        // & , | , ^ , ~ , << , >> bitwise operators
        System.out.println(2 & 3); // output will be 2
        // steps: 2 = 10 , 3 = 11
        // 10
        System.out.println(9 & 10);
        // & is and operator
        // 1 and 1 = 1
        // steps: 9 = 1001 , 10 = 1010
        // 1000 = 8
        System.out.println(9 | 10); // output will be 11
        // | is or operator
        // steps: 9 = 1001 , 10 = 1010
        // 1011 = 11
        System.out.println(9 ^ 10);
        // ^ is xor operator // define as follows
        // Same -- > 0 // Different -- > 1
        // steps: 9 = 1001 , 10 = 1010
        // 0011 = 3
        System.out.println(~9); // output will be -10
        // ~ is not operator
        // ~n = -(n+1)
        System.out.println(9 << 2); // output will be 36
        // << is left shift operator
        // formula = n * 2^x
        // steps: 9 * 2^2 = 9 * 4 = 36
        System.out.println(9 >> 2); // output will be 2

        // += , -= , *= , /= , %= shorthand operators
        // ? : ternary operator
        System.out.println((6 > 4) ? "I am true" : "I am false");
        // condition ? if true : if false
        // example
        int age = 18;
        String eligibility = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
        System.out.println(eligibility);
        // precedence and associativity

        // operator precedence
        int x = 6 + 3 * 4 / 2 - 1; // output will be 11
        // steps: 6 + 12 / 2 - 1
        // 6 + 6 - 1
        // 12 - 1
    }

}
