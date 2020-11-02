package m01.Tests;

public class Evklid {
    public static void main(String[] args) {
        System.out.println(nok(1080, 1920));
    }
    public static int nok(int a,int b) {
        while (b !=0) {
            int tmp = a%b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
