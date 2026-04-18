import java.io.*;
class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class SerializationImp {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Sam Mathew");
        try {
            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
            oos.close();
            fos.close();
            System.out.println("Object serialized successfully!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}