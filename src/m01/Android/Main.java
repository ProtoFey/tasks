package m01.Android;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        Square square = new Square(5, 5, 6);
        System.out.println(square);
        System.out.println(square.getArea());

        Circle circle = new Circle(5, 5, 3);
        System.out.println(circle);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println(triangle.getArea(triangle));
    }
}