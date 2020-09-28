package m01.s12;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        System.out.print(a + 2 - a % 2);
    }
}