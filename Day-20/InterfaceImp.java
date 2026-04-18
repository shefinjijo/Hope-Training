interface Test{
    public void show(int a,int b);
}
public class InterfaceImp {
    public static void main(String[] args) {
        Test obj=(a,b)->System.out.println("Hello from the interface implementation!"+ (a+b));
        obj.show(10,20);
    }
}
