package m01.s16;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number_1 = in.nextInt();
        int number_2 = in.nextInt();
        int number_3 = in.nextInt();
        int[] array = new int[]{number_1, number_2,number_3};
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}