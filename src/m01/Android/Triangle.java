package m01.Android;

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
        double l1 = Math.sqrt((Math.pow(triangle.getV1().x - triangle.getV2().x, 2) + Math.pow(triangle.getV1().y-triangle.getV2().y, 2)));
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
