import java.util.*;

public class constructorOverloading {
    constructorOverloading(int i){
        System.out.println("parametrized constructor and overloading with int");
    }
    constructorOverloading(String i){
        System.out.println("parametrized constructor and overloading with string");
    }
    public static void main(String[] args){
        constructorOverloading cr=new constructorOverloading(10);
        constructorOverloading cr1=new constructorOverloading("steve");
    }
}