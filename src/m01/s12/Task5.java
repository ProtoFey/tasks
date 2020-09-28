package m01.s12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int hour = 0, minute = 0;
        while (n > 59) {
            minute += 1;
            n -= 60;
        }
        while (minute > 59) {
            hour += 1;
            minute -= 60;
        }
        while (hour > 23)
            hour -= 24;
        System.out.printf("%d:%02d:%02d", hour, minute, n);
    }
}