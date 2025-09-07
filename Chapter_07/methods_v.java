package Chapter_07;

public class methods_v {
    static void change(int a) {
        a = 98;
    }

    static void student() {

        System.out.println("hi, hope you are good ,\n" +
                "i miss you still");
        return;
    }

    public static void main(String[] args) {
        // student();
        int[] marks = { 52, 73, 77, 89, 98, 94 };

        int x = 45;
        change(x);
        System.out.println("the value of x after running change is " + x);

    }
}
