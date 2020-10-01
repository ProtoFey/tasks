package m01.s18;

import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            n = in.nextInt();
            arr.add(n);
            if (n < 0)
                count ++;
        }
        for (int i = 0; i < n; i++){

        }
    }
}
