package chapter_03.PracticeSet_03;

import java.util.*;

public class P_q1 {
    public static void main(String[] args) {

        String name = "Jack Parker";
        System.out.println(name);
        // problem 1
        System.out.println(name.toLowerCase());
        // Problem 2
        System.out.println(name.replace("Jack Parker", "Sonalika Madhur"));
        // Problem 3
        String name1 = "Dear <|name|> , thanks a lot";
        // replace <|name|> with a string (Some name)
        System.out.println(name1.replace("<|name|>", "Riya"));
        // problem 4
        String myString = "this string contains sona  ghghg     double and triple space";
        System.out.println(myString.indexOf("t"));
        System.out.println(myString.indexOf("g"));
        System.out.println(myString.indexOf("  "));

        // problem 5
        // escape sequence characters
        System.out.println("DearHarry,\n\tThis\bJava Course is nice\n\tthanks");
        String myLetter = "Dear Harry ,\n\tThis Java Course is Nice.\n\tThanks!";
        System.out.println(myLetter);

    }

}
