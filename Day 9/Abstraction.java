abstract class Animal{
    abstract void sound();
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meows");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.sound();
    }
    
}
