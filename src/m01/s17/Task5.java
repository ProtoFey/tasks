package m01.s17;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), count = 0;

        while (a > 0) {
            count ++;
            a /= 2;
        }

        System.out.println(count);
    }
}
