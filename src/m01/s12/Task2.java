package m01.s12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(sumDigitsInNumber(Integer.parseInt(reader.readLine())));
    }

    public static int sumDigitsInNumber(int number) {
        return number / 100 + number / 10 % 10 + number % 10;
    }
}