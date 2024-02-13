import java.util.*;

class Student{
    int rollNo;
    String name;
    float fees;
    String branch;
    int year;
    int sem;
    int age;
    static String clg;
    public Student(int rollNo, String name, float fees, String branch, int year, int sem, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
        this.branch = branch;
        this.year = year;
        this.sem = sem;
        this.age = age;
        clg = "PU";
    }
    @Override
    public String toString(){
        return "Roll no.: "+rollNo+" | " + "Name : "+ name+" | " + "Fees : " + fees+" | "+ "Branch : " + branch +" | "+ "Year : " + year +" | "+"Sem : "+ sem +" | "+ "Age : " + age +" | " +"College : " + clg ;
    }
}

abstract class AgeComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if(s1.age == s2.age)
            return 0;
        else if(s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}
class FeesComprator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if (s1.fees == s2.fees)
            return 0;
        else if (s1.fees > s2.fees) {
            return 1;
        } else {
            return -1;
        }

    }

}

abstract class NameComprator implements Comparator{
    public int compare(Object o1, Object o2){
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        return s1.name.compareTo(s2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Student(1,"Shiva",10000.00f,"cse",1,1,18));

        arrayList.add(new Student(2,"Venky",15000.00f,"ise",1,2,20));

        arrayList.add(new Student(3,"Jesus",17000.00f,"ece",2,3,19));

        arrayList.add(new Student(4,"Alla",12000.00f,"eee",2,4,21));

        arrayList.add(new Student(5,"Budha",11000.00f,"mech",1,1,21));

        System.out.println("Sorting by Name");
        System.out.println("-----------------");
        Collections.sort(arrayList, new NameComprator() {
            @Override
            public int compare(Object o1, Object o2) {
                    return super.compare(o1, o2);
            }
        });
        Iterator itr1 = arrayList.iterator();
        while(itr1.hasNext()){
            Student st = (Student)itr1.next();
            System.out.println(st);

        }
        System.out.println("----------------");
        System.out.println("Sorting by Age");
        System.out.println("----------------");
        Collections.sort(arrayList, new AgeComparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return super.compare(o1, o2);
            }
        });
        Iterator itr2 = arrayList.iterator();
        while(itr2.hasNext()){
            Student st = (Student)itr2.next();
            System.out.println(st);
        }

    }
}
