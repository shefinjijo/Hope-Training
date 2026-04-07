class dConstruct{
    dConstruct(int x){
        System.out.println("iam inside parametrized contructor");
    }
}
public class defaultConstructor{
    public static void main(String[] args) {
        System.out.println("see your defalut constructor");
        dConstruct dc=new dConstruct(10);
    }
}