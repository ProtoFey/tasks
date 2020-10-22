package m01.s17;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), number = 10;

        while (a > 0) {
            if (a % 10 < number && a % 10 > 0)
                number = a % 10;
            a /= 10;
        }
        System.out.println(number);
    }
}
