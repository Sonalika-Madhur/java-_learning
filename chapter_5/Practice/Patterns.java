package chapter_5.Practice;

import java.nio.channels.Pipe.SourceChannel;

public class Patterns {
    public static void main(String[] args) {
        // outer loop
        for (int i = 0; i <= 4; i++) {
            // inner loop
            for (int j = 0; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // *****
        // *****
        // *****
        // *****
        // *****
    }

}
