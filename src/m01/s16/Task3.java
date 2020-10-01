package m01.s16;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a % 100;
        int c = a % 10;
        if (b > 10 && b < 20)
            System.out.println(a + " TOPTOB");
        else if (c == 1)
            System.out.println(a + " TOPT");
        else if (c > 1 && c < 5)
            System.out.println(a + " TOPTA");
        else System.out.println(a + " TOPTOB");
    }
}

