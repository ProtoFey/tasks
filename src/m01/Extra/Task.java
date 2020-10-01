package m01.Extra;

public class Task {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = a;
        b[0] = 10;
        System.out.println(a[0]);
    }
}
