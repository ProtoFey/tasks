package m01.s17;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 1;
        while (n >= 0) {
            count++;
            n = in.nextInt();
        }
        System.out.print(count);
    }
}
