import java.util.*;
public class perimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.print("Enter Length: ");
        l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        b = sc.nextInt();  
        System.out.print("Perimeter of rectangle is: "+" "+ (2*(l+b)));
        sc.close();
    }
}
