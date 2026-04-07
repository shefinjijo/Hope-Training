class Chairman{
    void display1(){
        System.out.println("Chairman");
    }
}
class ManagingDirector extends Chairman{
    void display2(){
        System.out.println("Managing Director");
    }
}
class Director extends ManagingDirector{
    void display3(){
        System.out.println("Director");
    }
}
class Staff extends Director{
    void display4(){
        System.out.println("Staff");
    }
}
class Student extends Staff{
    void display5(){
        System.out.println("Student");
    }
}
public class MultilevelInheritance {
 public static void main(String[] args) {
        Student s1=new Student();
        s1.display5();
        s1.display4();
        Staff s2=new Staff();
        s2.display3();
        Director s3=new Director();
        s3.display2();
        ManagingDirector s4=new ManagingDirector();
        s4.display1();
 }   
}