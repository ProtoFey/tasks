package m01.Android;

import java.util.Scanner;

public class Dot {
    int y;
    int x;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt(), y = in.nextInt();
        Dot dot = new Dot(x,y);
    }
}
