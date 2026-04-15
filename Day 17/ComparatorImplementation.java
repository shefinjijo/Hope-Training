import java.util.*;

class Student {
    int rollNo;
    int age;
    double marks;

    Student(int rollNo, int age, double marks) {
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return this.rollNo + " " + this.age + " " + this.marks;
    }

}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.marks, s1.marks);
    }
}

class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

public class ComparatorImplementation {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(16, 15, 80.5F));
        students.add(new Student(15, 15,90.5F));
        students.add(new Student(3, 25, 80.0F));
        students.add(new Student(3, 5, 92.0F));
        students.add(new Student(2, 5, 50.0F));
        Collections.sort(students, new AgeComparator());
        Collections.sort(students, new MarksComparator());
        Collections.sort(students, new RollNoComparator());
        for (Student s : students) {
            System.out.println(s);
        }

    }

}