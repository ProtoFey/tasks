package m01.Android;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float centerX = 1, centerY = 2, radius = 3;
        printCircle(centerX, centerY, radius);
        centerX = 3;
        centerY = 1;
        radius = 2;
        printCircle(centerX, centerY, radius);
    }
    public static float printCircle (float centerX, float centerY, float radius)  {
        System.out.println(centerX + " " + centerY +  " " + radius);
    }
}
