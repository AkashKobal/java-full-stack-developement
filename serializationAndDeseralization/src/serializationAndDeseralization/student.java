package serializationAndDeseralization;

import java.io.Serializable;

public class student implements Serializable {
	int id;
	int rollNo;
	String name;
	String branch;
	String college;
	
	public student(int id, int rollNo, String name, String branch, String college) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
		this.college = college;
    }
    public String toString(){
        return "Student [id=" + id + ", rollNo=" + rollNo + ", name=" + name + ", branch=" + branch + ", college=" + college + "]";
    }

    }
