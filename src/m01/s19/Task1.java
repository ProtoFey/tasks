package m01.s19;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        System.out.print(returnSum(a));
    }
    static int returnSum(int a) {
        return a % 10 + a / 10;
    }
}
