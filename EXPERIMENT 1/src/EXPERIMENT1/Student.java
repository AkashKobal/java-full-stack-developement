package EXPERIMENT1;

import java.io.Serializable; 

public class Student implements Serializable {  
      int rno;  
      String name; 
      float  fees;
 public Student(int id1, String name1, float fees1) {  
     this.rno = id1;  
     this.name = name1;  
     this.fees = fees1;
 }  
public String toString() {
     return rno + " " + name +" " + fees +"\n";
}  
}

