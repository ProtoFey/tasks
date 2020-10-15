package m01.Android;

import java.util.Scanner;

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