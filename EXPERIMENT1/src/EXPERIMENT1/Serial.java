package EXPERIMENT1;

import java.io.*;    
class Serial{    
 public static void main(String args[]){    
  try
{    
          Student s1 =new Student(1,"ram", 1000);
          Student s2 =new Student(2,"shyam", 2000);
          Student s3 =new Student(3,"mohan", 3000);
          Student s4 =new Student(4,"sohan", 4000);
          Student s5 =new Student(5,"mohan", 5000);
          FileOutputStream fout=new FileOutputStream("d:\\f.txt");    
          ObjectOutputStream out=new ObjectOutputStream(fout);    
           out.writeObject(s1);
           out.writeObject(s2);
           out.writeObject(s3);
           out.writeObject(s4);
           out.writeObject(s5);
          out.flush();    
          out.close();    
          System.out.println("success");    
  }
catch(Exception e){
          System.out.println(e);
}    
 }    
}    
