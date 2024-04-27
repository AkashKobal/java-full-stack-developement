package EXPERIMENT2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TEMP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList sl=new ArrayList(); 
		sl.add(new Student(1,"Shiva",10000.00f,"cse",1,1,18,20000.00f)); 
		sl.add(new Student(2,"Venky",15000.00f,"ise",1,2,20,25000.00f)); 
		sl.add(new Student(3,"Jesus",17000.00f,"ece",1,1,19,30000.00f)); 
		sl.add(new Student(3,"Alla",12000.00f,"eee",1,1,19,30000.00f)); 
		sl.add(new Student(3,"Budha",11000.00f,"mech",1,1,21,30000.00f));
		System.out.println("Sorting by Name"); 
		System.out.println("_______________"); 
		Collections.sort(sl,new NameComparator()); 
		Iterator itr=sl.iterator(); 
		while(itr.hasNext()){ 
			Student st=(Student)itr.next(); 
			System.out.println(st); 
		} 
		System.out.println("Sorting by age"); 
		System.out.println("______________"); 
		Collections.sort(sl,new AgeComparator()); 
		Iterator itr2=sl.iterator(); 
		while(itr2.hasNext()) { 
		           Student st=(Student)itr2.next(); 
		           System.out.println(st ); 
		} 
		System.out.println("Sorting by fees"); 
		System.out.println("______________"); 
		Collections.sort(sl,new FeesComparator()); 
		Iterator itr1=sl.iterator(); 
		while(itr1.hasNext()){ 
			Student st=(Student)itr1.next(); 
		              System.out.println(st); 
	               }
		System.out.println("Sorting by salary");
		System.out.println("______________");
		Collections.sort(sl,new SalaryComparator());
		Iterator itr3=sl.iterator();
		while (itr3.hasNext()) {
			Student st = (Student) itr3.next();
			System.out.println(st);
		}
	}
	
	
}

