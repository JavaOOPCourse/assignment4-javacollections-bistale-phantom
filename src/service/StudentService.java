package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        students.add(new Student(1, "Nazik", 3.9));
        students.add(new Student(2, "Aiperi", 3.6));
        students.add(new Student(3, "Aibike", 3.2));
        students.add(new Student(4, "Mirana", 3.5));
        students.add(new Student(5, "Dilia", 3.7));
        System.out.println("Initialized successfuly");
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        for (Student s: students) {
            if (s.getGpa() < 2.0) {
                students.remove(s);
                System.out.println("Removed successfuly");
            }
        }
        System.out.println("Not students with gpa < 2.0");
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        Student Top = students.get(0);
        for (Student s: students) {
            if (s.getGpa() > Top.getGpa()) {
                Top = s;
            }
        }
        System.out.println("Highest GPA is = " + Top.getGpa());
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        Student kasym = new Student(6, "Kasym", 3.8);
        students.add(2, kasym);
    }

    public void printStudents() {
        // TODO: Print using Iterator
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s);
        }
    }
}
