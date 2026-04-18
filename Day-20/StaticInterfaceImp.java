interface Carengine{
    static String display(){
        return "Engine is designed with 3000rpm";
    }
}
class hello implements Carengine{
    public void show(){
        System.out.println("Hello from the interface implementation!");
    }
}
public class StaticInterfaceImp {
    public static void main(String[] args) {
        String s=Carengine.display();
        System.out.println(s);
    }
}
