package experimentFour;

import java.util.ArrayList;
import java.util.Collections;

public class expFour {
	int rno;
	String name;
	int age;
	float fees;
	
	public expFour(int rno, String name, int age, float fees) {
		this.rno = rno;
		this.name = name;
		this.age = age;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return rno + " " + name + " " + age + " " + fees;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<expFour> s = new ArrayList<expFour>();
		s.add(new expFour(101, "Vijay", 23, 5600));
		s.add(new expFour(102, "Ajay", 27, 7800));
		s.add(new expFour(103, "Jai", 21, 4500));
		 System.out.println("Sorting on the basis of name...");  
		  
	        // implementing lambda expression  
	        Collections.sort(s,(s1,s2)->{return s1.name.compareTo(s2.name);});  
	         for(expFour l:s){  
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

