package lambdaExperession;

import java.util.ArrayList;
import java.util.Collections;

class exp4 {
    public static void main(String[] args) {
    	ArrayList <Student> s = new <Student>ArrayList();
       s.add(new Student(1,"abc",20,20000.00f));
       s.add(new Student(2,"xyz",15,15000.00f));
       s.add(new Student(3,"def",10,10000.00f));
        
       System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(s,(s1,s2)->{return s1.name.compareTo(s2.name);});  
         for(Student l:s){  
            System.out.println(l);  
        }  
        System.out.println("Sorting by age");  
  
        Collections.sort(s,(s1,s2)-> s1.age - s2.age); 
        s.forEach((l)->System.out.println(l)); 
        
        System.out.println("Sorting by Fees");  
  
        Collections.sort(s,(s1,s2)-> (int)s1.fees - (int)s2.fees); 
        s.forEach((l)->System.out.println(l));
        
    }
}