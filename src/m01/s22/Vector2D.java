package m01.s22;

import java.util.Locale;

public class Vector2D {
    static int count = 0;
    public double vX, vY;
    public Vector2D() {
        this.vX = 1d;
        this.vY = 1d;
        count++;
    }
    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }
    public Vector2D(Vector2D vector2D) {
        this.vX = vector2D.vX;
        this.vY = vector2D.vY;
        count++;
    }
    public void print() {
        System.out.println(String.format(Locale.US, "(%.2f, %.2f)", this.vX, this.vY));
    }
    public double length() {
        return Math.sqrt(Math.pow(this.vX, 2) + Math.pow(this.vY, 2));
    }
    public void add(Vector2D vector2D) {
        this.vX += vector2D.vX;
        this.vY += vector2D.vY;
    }
    public void sub(Vector2D vector2D) {
        this.vX -= vector2D.vX;
        this.vY -= vector2D.vY;
    }
    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }
    public void normalized() {
        double cos = this.vX / length();
        double sin = this.vY / length();
        this.vX = 1 * cos;
        this.vY = 1 * sin;
    }
    public double dotProduct(Vector2D vector2D) {
        return this.vX * vector2D.vX + this.vY * vector2D.vY;
    }

    public static void main(String[] args) {
        Vector2D vA = new Vector2D();
        Vector2D vB = new Vector2D(5.0, 7.0);
        Vector2D vC = new Vector2D(vB);
        vA.add(vB);
        vA.print();
        vA.sub(vC);
        vA.print();
        System.out.println(vB.length());
        vC.scale(1.5);
        vC.print();
        vC.normalized();
        System.out.println(vC.length());
        vC.scale(2);
        System.out.println(vA.dotProduct(vB));
        System.out.println(vA.count);
    }
}
