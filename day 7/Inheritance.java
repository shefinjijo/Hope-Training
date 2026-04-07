class Animal{
    void display(){
        System.out.println("there are multiple ");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy{
    void weeps(){
        System.out.println("");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.bark();
        dog.display();
        System.out.println(dog.hashCode());
    }
}
