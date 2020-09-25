package m01.s15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();

        System.out.println(belong(a));
    }
    static boolean belong(float a) {
        return a >= 3 && a <= 8;
    }
}