package module1.experiment1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class Deserial {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\module1\\src\\module1\\experiment1\\file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Student student = (Student) objectInputStream.readObject();
            System.out.println(student);
            objectInputStream.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
