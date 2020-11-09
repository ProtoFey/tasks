package m01.s21;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toOctalString(n));
        System.out.println(Integer.toHexString(n));
        System.out.println(n >= -Math.pow(2, 7) && n < Math.pow(2, 7)? "YES": "NO");
        System.out.println(n >= -Math.pow(2, 15) && n < Math.pow(2, 15)? "YES" : "NO");
    }
}
