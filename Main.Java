import java.util.*;
import java.io.*;


class Main{
    //Method to sort ArrayList of students based on a given comparator
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator){
        //using a selection sort algorithm
        for (int i = 0; i < students.size() - 1; i++){
            int min_idx = i;
            for (int j = i+1; j < students.size(); j++)
                if (comparator.compare(students.get(j), students.get(min_idx)) < 0)
                    min_idx = j;
//Swapping the Found Minimum element with the first element for the unsorted part
            Student temp = students.get(min_idx);
            students.set(min_idx, students.get(i));
            students.set(i, temp); //The method sorts ArrayList of students on the given comparator
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        // This is the part were we add the 10 students
        for(int i = 0; i < 10; i++){
            ar.add(new Student(i, "Julia" + i, "Address 10 " + i));
            ar.add(new Student(i, "Isaac" + i, "Address 9 " + i));
            ar.add(new Student(i, "Hannah" + i, "Address 8 " + i));
            ar.add(new Student(i, "George" + i, "Address 7" + i));
            ar.add(new Student(i, "Fiona" + i, "Address 6" + i));
            ar.add(new Student(i, "Ethan" + i, "Address 5" + i));
            ar.add(new Student(i, "Diana" + i, "Address 4" + i));
            ar.add(new Student(i, "Charlie" + i, "Address 3" + i));
            ar.add(new Student(i, "Bo" + i, "Address 2" + i));
            ar.add(new Student(i, "Alex" + i, "Address 1" + i));
        }

        System.out.println("Unsorted");
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));

        Comparator<Student> rollComparator = new Comparator<Student>(){
            public int compare(Student a, Student b) {
                return a.rollno - b.rollno;
            }
        };

        selectionSort(ar, rollComparator);

        System.out.println("\nSorted by roll number");
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
//Compactor for Name
        Comparator<Student> nameComparator = new Comparator<Student>(){
            public int compare(Student a, Student b) {
                return a.name.compareTo(b.name);
            }
        };
//Sorting the list by name
        selectionSort(ar, nameComparator);

        System.out.println("\nSorted by name");
        for(int i=0; i<ar.size(); i++)
            System.out.println(ar.get(i));
    }
}

//Second code in Student


