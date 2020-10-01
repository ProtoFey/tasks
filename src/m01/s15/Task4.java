package m01.s15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a > 99 && a < 1000 && a % 5 == 0);
    }
}