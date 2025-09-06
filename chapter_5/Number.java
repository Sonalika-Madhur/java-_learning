package chapter_5;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Number {
    public static void main(String[] args) {
        System.out.println(" enter the number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i <= 200) {
            System.out.println(i);
            i++;
        }
    }

}
