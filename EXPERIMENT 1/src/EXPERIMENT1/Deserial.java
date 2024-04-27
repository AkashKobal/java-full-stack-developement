package EXPERIMENT1;

import java.io.*;  
class Deserial {  
 public static void main(String args[]){  
         try{  
                FileInputStream fin =  new FileInputStream("d:\\f.txt");
               ObjectInputStream in=new ObjectInputStream(fin);  
               Student s1=(Student)in.readObject();
               Student s2=(Student)in.readObject();
               Student s3=(Student)in.readObject();
               Student s4=(Student)in.readObject();
               Student s5=(Student)in.readObject();
               
               
               System.out.println(s1);
               System.out.println(s2);
               System.out.println(s3);
               System.out.println(s4);
               System.out.println(s5);
              in.close();  
  }catch(Exception e){
          System.out.println(e);
  }  
 }  
}  
