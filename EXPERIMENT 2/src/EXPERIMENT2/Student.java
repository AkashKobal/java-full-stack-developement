package EXPERIMENT2;

import java.io.*;
import java.util.*;

class Student {
	int rollno;
	String name;
	float fees;
	String branch;
	int year;
	int sem;
	int age;
    static String clg;
    float salary;

    public Student(int rollno,String name,float fees,String branch,int year,int sem,int age,float salary) {
    	this.rollno = rollno;
    	this.name = name;
    	this.fees = fees;
    	this.branch = branch;
    	this.year = year;
    	this.sem = sem;
    	this.age = age;
    	clg="PU";
    	this.salary=salary;
    }
    @Override
    public String toString() {
    	return rollno + " "+ name + " " + fees + " " + branch + " " + year + sem + " " + age + " " + clg + " "+salary+"\n";
    }
}
class AgeComparator implements Comparator { 
	public int compare(Object o1, Object o2) { 
		Student s1=(Student)o1; 
		Student s2=(Student)o2; 
		if(s1.age==s2.age) 
			return 0; 
		else if(s1.age>s2.age) 
			return 1; 
		else
			return -1; 
	} 
} 
class SalaryComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		if (s1.salary == s2.salary)
			return 0;
		else if (s1.salary > s2.salary)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator{
	public int compare(Object o1, Object o2) { 
		Student s1=(Student)o1; 
		Student s2=(Student)o2; 
		return	s1.name.compareTo(s2.name); 
} 
} 
class FeesComparator implements Comparator { 
	public int compare(Object o1,Object o2) { 
		Student s1=(Student)o1; 
		Student s2=(Student)o2; 
		if(s1.fees==s2.fees) 
			return 0; 
		else if(s1.fees>s2.fees) 
			return 1; 
		else
			return -1; 
	} 
} 

