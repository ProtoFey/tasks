package m01.Android;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Figure {
    String color = "Black";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);

        Point point = new Point(1,2);
        point.getPoint();
    }
}

class Point extends Figure {
    int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "{" + x + ";" + y + "}" + " Цвет: " + color;
    }
    public void getPoint() {
        System.out.println("{" + x + ";" + y + "}" + " Цвет: " + color);
    }
}
class Circle extends Figure {
    Point center;
    float radius;

    public Circle() {
        this.center = new Point();
        this.radius = 1;
    }
    public Circle(int x, int y, float radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }
    public double getArea(float radius) {
        return 2 * Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString() {
        return "Центр: " + center + " Радиус: " + radius + " Цвет: " + color;
    }
    public void getCircle() {
        System.out.println("Центр: " + center + "; Радиус: " + radius + " Цвет: " + color);
    }
}
class Square extends Figure {
    Point vertex;
    float length;

    public Square() {
        this.vertex = new Point();
        this.length = 1;
    }
    public Square(int x, int y, float length) {
        this.vertex = new Point(x, y);
        this.length = length;
    }
    @Override
    public String toString() {
        return "Вершина " + vertex + "; Сторона: " + length + " Цвет: " + color;
    }
    public void getSquare() {
        System.out.println("Вершина " + vertex + "; Сторона: " + length + " Цвет: " + color);
    }
}
class Triangle extends Figure {
    Point vertex1, vertex2, vertex3;

    public Triangle() {
        this.vertex1 = new Point();
        this.vertex2 = new Point(0, 3);
        this.vertex3 = new Point(4, 0);
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.vertex1 = new Point(x1, y1);
        this.vertex2 = new Point(x2, y2);
        this.vertex3 = new Point(x3, y3);
        double l1 = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        double l2 = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
        double l3 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
        if (l1 + l2 < l3 || l2 + l3 < l1 || l3 + l1 < l2) {
            System.out.println("Вы ввели не существующий треугольник");
            System.out.println("Вы лохъ. Вызывайте заного треугольник");
        }
    }
    @Override
    public String toString() {
        return "Первая вершина: " + vertex1 + "; Вторая вершина " + vertex2 + "; Третья вершина" + vertex3 + " Цвет: " + color;
    }
    public void getTriangle() {
        System.out.println("Первая вершина: " + vertex1 + "; Вторая вершина " + vertex2 + "; Третья вершина" + vertex3 + " Цвет: " + color);
    }
}