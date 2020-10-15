package m01.Android;

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