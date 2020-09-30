package m01.s17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int count = 0;
        do {
            n = in.nextInt();
            if (n > 10) {
                count += n;
            }
        }
        while (n % 5 != 0);
        System.out.println(count);
    }
}
