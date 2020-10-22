package m01.s17;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), count = 0;

        while (n < 25 || n > 100) {
            n = in.nextInt();
        }

        for (int i = 25; i < n; i++) {
            if (i % 2 == 0)
                count += i;
        }
        System.out.println(count);
    }
}
