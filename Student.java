import java.util.*;

class Student {
    int rollno;
    String name;
    String address;

    //Constructor for the Student class
    public Student(int rollno, String name, String address){
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    //used toString method to print the Students details
    public String toString(){ //Above shows students with three fields; rollno, name, and address.
        return this.rollno + " " + this.name + " " + this.address;
    }
}

//First code in Student
