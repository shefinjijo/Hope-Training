package ecommerce.model;

public class Product {
    private int id;
    private String name;
    private int price;
    public Product(int id,String name,int price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public int getPrice(){
        return this.price;
    }
    public void display(){
        System.out.println("Id: "+this.id);
        System.out.println("Name: "+this.name);
        System.out.println("Price:Rs. "+this.price);
    }
}
