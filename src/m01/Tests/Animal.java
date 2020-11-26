package m01.Tests;

abstract class Animal{
    public abstract String speak();

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.speak());
    }
}