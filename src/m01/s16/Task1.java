package m01.s16;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x >= 0) {
            if (x < 10)
                System.out.println("DIGIT");
            else if (x < 100)
                System.out.println("NUM");
        }
        if (x < 0 || x > 99)
            System.out.println("OTHER");
    }
}
