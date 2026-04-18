interface method{
    default void show(){
        System.out.println("Hello from the interface!");
    }
}
class hello implements method{
    public void show(){
        System.out.println("Hello from the interface implementation!");
    }
}
public class InterfaceImp2 {
    public static void main(String[] args) {
        hello obj=new hello();
        obj.show();
    }
}
