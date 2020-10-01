package m01.s15;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(notBelong(in.nextFloat()));
    }
    static boolean notBelong (float a) {
        return !(a >= -2 && a <= 3) && !(a >= 6 && a <= 9);
    }
}