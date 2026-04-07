package ecommerce.service;

import java.util.*;
import ecommerce.model.Product;;
public class CartService {
    private ArrayList<Product> cart = new ArrayList<>();
    public void addProduct(Product p){
        cart.add(p);
    }
    public int calculateTotal(){
        int total=0;
        for(Product p:cart){
            total+=p.getPrice();
        }
        return total;
    }
    public void showCart(){
        for(Product p:cart){
            p.display();
        }
    }
}
