package serializationAndDeseralization;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class serial {
    public static void main(String[] args) {
        try {
            student s1 = new student(1,116,"Akash","CSE","PU");
            student s2 = new student(2,117,"Rahul","CSE","PU");
            student s3 = new student(3,118,"Rohit","CSE","PU");
            student s4 = new student(4,119,"Raj","CSE","PU");
            student s5 = new student(5,120,"Ravi","CSE","PU");
             
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\module1\\src\\module1\\experiment1\\file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s1);
            objectOutputStream.writeObject(s2);
            objectOutputStream.writeObject(s3);
            objectOutputStream.writeObject(s4);
            objectOutputStream.writeObject(s5);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Sucess");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
