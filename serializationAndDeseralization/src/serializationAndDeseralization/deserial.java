package serializationAndDeseralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class deserial {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\module1\\src\\module1\\experiment1\\file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student s1 = (student) objectInputStream.readObject();
            student s2 = (student) objectInputStream.readObject();
            student s3 = (student) objectInputStream.readObject();
            student s4 = (student) objectInputStream.readObject();
            student s5 = (student) objectInputStream.readObject();
            
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            System.out.println(s5);
            objectInputStream.close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}

