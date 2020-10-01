package m01.s17;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int result = 0;
        while (n < 100) {
            while (n > 0) {
                count += n % 10;
                n = n / 10;
            }
            n = in.nextInt();
            result += count;
            count = 0;
        }
        System.out.println(result);
    }
}
