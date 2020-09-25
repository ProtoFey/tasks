package m01.s15;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 4; i++) {
            if (list.get(0).equals(-list.get(1))) {
                System.out.println("Не доделано");
            }
        }
    }
}