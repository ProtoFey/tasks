package m01.Android;

public class Circle {
    private float centerX;
    private float centerY;
    private float radius;

    private Circle(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    private Circle(float radius) {
        this.radius = radius;
        this.centerY = 0;
        this.centerX = 0;
    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getCenterX() {
        return centerX;
    }

    public float getCenterY() {
        return centerY;
    }

    public void setCenterX(float centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(float centerY) {
        this.centerY = centerY;
    }

    public static void main(String[] args) {
        Circle circleOne = new Circle(15);
    }
}
