package m01.s19;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        for (int i = 10; i <= 100; i++) {
            if (i % 7 == 0) {
                count += returnSum(i);
            }
        }

        System.out.print(count);
    }
    static int returnSum(int a) {
        return a % 10 + a / 10;
    }
}
