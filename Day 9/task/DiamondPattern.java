interface A {
    default void show() {
        System.out.println("A interface");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B interface");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C interface");
    }
}

class D implements B, C {

    public void show() {
        B.super.show();  
    }}
class DiamondPattern{
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }}
