package lambdaExperession;

import java.util.*;
class Student{  
   int rno;  
   String name; 
   int age;
   float fees; 
   
   public Student(int rno, String name, int age, float fees) {  
       super();  
       this.rno = rno;  
       this.name = name;  
       this.age = age;
       this.fees = fees;
   } 
   
 
   @Override
   public String toString() {
       return rno + "   " + name + "  " + age + "   " + fees;
   }
}  