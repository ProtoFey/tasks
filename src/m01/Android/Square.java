package m01.Android;

class Square extends Figure {
    Point vertex;
    float length;

    public Square() {
        this(new Point(1, 1), 1);
//        this.vertex = new Point();
//        this.length = 1;
    }

    public Square(int x, int y, float length) {
//        this.vertex = new Point(x, y);
        this(new Point(x, y), length);
//        this.length = length;
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