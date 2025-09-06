package Chapter_04;

public class Cwh_17_logial {
    public static void main(String[] args) {
        // logical operators
        // && --> AND True(1) && true(1) = 1
        // || --> OR if any one is True (1) than it will return true(1) only
        // ! --> NOT 1 --> 0 , 0 --> 1
        boolean a = true;
        boolean b = false;
        if (a == true && b == true) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        if (a == true || b == true) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        System.out.println("logical operator NOT");
        if (a != b) {
            System.out.println("Y");

        } else {
            System.out.println("N");
        }
        System.out.println("logical operator AND");
        if (a && b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println("Logical operator OR");
        if (a || b) {
            System.out.println("haan ji");
        } else {
            System.out.println(" naa ji");
        }

    }

}
