class Parent{
    void display(){
        int x=10;
        System.out.println("Inside Parent Class");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("I am in Child Class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Inside Main Function");
        Child c=new Child();
        Parent p=new Parent();
        Parent p1=new Child();
        p1.display();
        p.display();
        

    }
}