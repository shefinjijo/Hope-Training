class Student{
String name;
String rollno;
String dept;
     Student(String name,String rollno,String dept) {
        this.name=name;
        this.rollno=rollno;
        this.dept=dept;
    }
    void display(){
        System.out.println("Name: "+ this.name+"\nRoll no:"+this.rollno+"\nDept:"+this.dept);
    }
    
}
public class ThisKeywordExample {
    public static void main(String[] args) {
        Student s1=new Student("Steve","24cs72","CSE");
        s1.display();
        System.out.println(s1.hashCode());
        Student s2=new Student("Steve","1234","CS");
        s2.display();
        System.out.println(s2.hashCode());
        Student s3=new Student("Fran","4567","CS");
        s3.display();
        System.out.println(s3.hashCode());

    }
}