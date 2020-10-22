package m01.s17;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), number = 10;

        while (a > 0) {
            if (a % 2 == 1 && a % 10 < number)
                number = a % 10;
            a /= 10;
        }

        if (number == 10)
            System.out.println("NO");
        else
            System.out.println(number);
    }
}
