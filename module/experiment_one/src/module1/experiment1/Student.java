package module1.experiment1;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNo;
    String name;
    float fees;
    public Student(int id, String name, float fees){
        this.rollNo = id;
        this.name = name;
        this.fees = fees;
    }
    public String toString(){
        return "RollNo : "+rollNo+"\n"+
                "Name : "+name+"\n"+
                "Fees : "+fees;
    }

    }

