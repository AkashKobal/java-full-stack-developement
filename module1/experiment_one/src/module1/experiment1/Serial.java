package module1.experiment1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1,"Akash",115000);
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Admin\\IdeaProjects\\module1\\src\\module1\\experiment1\\file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(s1);
            objectOutputStream.flush();
            objectOutputStream.close();
            System.out.println("Sucess");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
