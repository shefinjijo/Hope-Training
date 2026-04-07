class Father{
    void display(){
        System.out.println("I am Father.I have 1 Son and Daughter");
    }
}
class Son extends Father{
    void job(){
        System.out.println("Since I am going to job.So give it to the sister");
    }
}
class Daughter extends Father{
    void business(){
    System.out.println("Since i have my own business and i will not manage your business properly.So handle over the business to brother");
}}

public class HieraricalInheritance {
    public static void main(String[] args) {
        Son s=new Son();
        s.display();
        s.job();
        Daughter d=new Daughter();
        d.display();
        d.business();


    }
}