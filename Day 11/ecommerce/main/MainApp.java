package ecommerce.main;

import ecommerce.model.Product;
import ecommerce.service.CartService;
import ecommerce.util.DiscountUtil;

public class MainApp {
    public static void main(String[] args) {
        CartService cart=new CartService();
        Product p1=new Product(1 ,"Iphone 18 pro max" ,DiscountUtil.applyDiscount(175000));
        Product p2=new Product(2 ,"Redmi note 15 pro max" ,DiscountUtil.applyDiscount(60000));
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.showCart();
        int totalAmount=cart.calculateTotal();
        System.out.println("Total amount: Rs. "+totalAmount);


    }
}
