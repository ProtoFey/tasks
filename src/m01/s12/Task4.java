package m01.s12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        a *= n;
        b *= n;
        while (b > 99) {
            b -= 100;
            a += 1;
        }
        System.out.print(a + " " + b);
    }
}