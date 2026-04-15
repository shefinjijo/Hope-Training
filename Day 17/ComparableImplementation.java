import java.util.*;

    class Student implements Comparable<Student>{
        int rollNo;
        String name;
        Student(int rollNo,String name){
            this.rollNo=rollNo;
            this.name=name;
        }
        public int compareTo(Student s){
            return s.rollNo - this.rollNo;
        }
    }

public class ComparableImplementation {      
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,"Alice"));
        students.add(new Student(1,"Bob"));
        students.add(new Student(2,"Charlie"));

        Collections.sort(students);
        for(Student s: students){
            System.out.println(s.rollNo + " " + s.name);
        }
        
    }
    
}