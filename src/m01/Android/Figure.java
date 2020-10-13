package m01.Android;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Figure {
    String color = "Black";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);


        Square square = new Square(5,5,6);
        System.out.println(square);
        System.out.println(square.getArea());

        Circle circle = new Circle(5,5,3);
        System.out.println(circle);
        System.out.println(circle.getArea());

        Triangle triangle = new Triangle();
        System.out.println(triangle);
        System.out.println(triangle.getArea(triangle));
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
        return "{" + x + ";" + y + "}";
    }
    public void getPoint() {
        System.out.println("{" + x + ";" + y + "}");
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
    public Circle(Point point, float radius) {
        this.center = point;
        this.radius = radius;
    }
    public String getArea() {
        return "Площадь Михаила Круга: " + 2 * Math.PI * Math.pow(this.radius, 2);
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
    public Square(Point point, float length) {
        this.vertex = point;
        this.length = length;
    }
    public String getArea() {
        return "Площадь квадрата: " + length*length;
    }
    @Override
    public String toString() {
        return "Вершина " + vertex + "; Сторона: " + length + " Цвет: " + color;
    }
    public void getSquare() {
        System.out.println("Вершина " + vertex + "; Сторона: " + length + " Цвет: " + color);
    }
}
class Triangle extends Figure {       //Класс треугольников
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
    }
    public Triangle(Point point1, Point point2, Point point3) {
        this.vertex1 = point1;
        this.vertex2 = point2;
        this.vertex3 = point3;
    }
    public Point getV1() {
        return vertex1;
    }
    public Point getV2() {
        return vertex2;
    }
    public Point getV3() {
        return vertex3;
    }

    public String getArea(Triangle triangle) {
        double l1 = Math.sqrt((Math.pow(triangle.getV1().x-triangle.getV2().x, 2) + Math.pow(triangle.getV1().y-triangle.getV2().y, 2)));
        double l2 = Math.sqrt((Math.pow(triangle.getV1().x-triangle.getV3().x, 2) + Math.pow(triangle.getV1().y-triangle.getV3().y, 2)));
        double l3 = Math.sqrt(Math.pow(triangle.getV2().x-triangle.getV3().x, 2) + Math.pow(triangle.getV2().y-triangle.getV3().y, 2));
        double halfP = (l1+l2+l3)/2;
        return "Площадь треугольника: " + Math.sqrt(halfP*(halfP-l1)*(halfP-l2)*(halfP-l3));
    }
    @Override
    public String toString() {
        return "Первая вершина: " + vertex1 + "; Вторая вершина " + vertex2 + "; Третья вершина" + vertex3 + " Цвет: " + color;
    }
    public void getTriangle() {
        System.out.println("Первая вершина: " + vertex1 + "; Вторая вершина " + vertex2 + "; Третья вершина" + vertex3 + " Цвет: " + color);
    }
}