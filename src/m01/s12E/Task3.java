package m01.s12E;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int a = 0;
        while (n > 0) {
            a += n % 10;
            n /= 10;
        }
        System.out.println (a);
    }
}