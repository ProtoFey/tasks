package m01.s19;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(countLessThanX(in.nextInt()));
    }

    static int countLessThanX(int x) {
        int count = 0;
        for (int i = 100; i < x; i++) {
            if (returnSum(i) % 13 == 0) {
                count++;
            }
        }
        return count;
    }

    static int returnSum(int a) {
        return a % 10 + a / 10 % 10  + a / 100;
    }
}