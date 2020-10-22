package m01.s17;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = 0;
        while (a > 0) {
            b ++;
            a /= 10;
        }
        System.out.println(b);
    }
}
