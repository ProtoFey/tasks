package m01.s15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(belong(in.nextFloat()));
    }
    static boolean belong(float a) {
        return a >= -3 && a <= 5 || a >= 9 && a <= 15;
    }
}