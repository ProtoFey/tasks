package m01.Tests;

import java.util.ArrayList;
import java.util.Scanner;

public class TestN1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        int x = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == x) {
                System.out.print(i+1 + " ");
                count ++;
            }
        }
        if (count == 0)
            System.out.println(-1);
    }
    short f(String a, int b) { return (short)b++;}
    double f(double a, int b) {return a+b+"";}
    void f(int d) { return d++;}
    int f(float a, float b) { return a+b;}
    float f(int a, double b) { return a+b;}
    String f() { return "a+b";}
}
