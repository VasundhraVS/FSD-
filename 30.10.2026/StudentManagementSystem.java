
package Day10;

import java.util.*;

class Student {

    int studentId;
    String studentName;
    String department;
    int marks;

    Student(int studentId, String studentName, String department, int marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.department = department;
        this.marks = marks;
    }

    void display() {

        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
        System.out.println("----------------------");
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        HashSet<Integer> studentIds = new HashSet<Integer>();

        // Adding 5 student records

        Student s1 = new Student(101, "Arun", "BCA", 85);
        Student s2 = new Student(102, "Divya", "BSc", 90);
        Student s3 = new Student(103, "Karthik", "BCom", 78);
        Student s4 = new Student(104, "Meena", "BBA", 88);
        Student s5 = new Student(105, "Ravi", "BCA", 95);

        students.add(s1);
        studentIds.add(s1.studentId);

        students.add(s2);
        studentIds.add(s2.studentId);

        students.add(s3);
        studentIds.add(s3.studentId);

        students.add(s4);
        studentIds.add(s4.studentId);

        students.add(s5);
        studentIds.add(s5.studentId);

        // Display all student details

        System.out.println("ALL STUDENT DETAILS");

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {

            Student s = itr.next();
            s.display();
        }

        // Search student using Student ID

        System.out.println("SEARCH STUDENT");

        int searchId = 102;
        boolean found = false;

        for (Student s : students) {

            if (s.studentId == searchId) {

                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }

        // Check duplicate Student ID

        System.out.println("DUPLICATE REGISTRATION");

        int newId = 102;

        if (studentIds.contains(newId)) {

            System.out.println("Duplicate Student ID not allowed!");
        } 
        else {

            studentIds.add(newId);
            System.out.println("Student registered successfully");
        }

        // Remove student using Student ID

        System.out.println("REMOVE STUDENT");

        int removeId = 103;

        Iterator<Student> iterator = students.iterator();

        while (iterator.hasNext()) {

            Student s = iterator.next();

            if (s.studentId == removeId) {

                iterator.remove();
                studentIds.remove(removeId);

                System.out.println("Student removed successfully");
                break;
            }
        }

        // Display updated student records

        System.out.println("UPDATED STUDENT DETAILS");

        for (Student s : students) {
            s.display();
        }

        // Find student with highest marks

        System.out.println("TOPPER DETAILS");

        Student topper = Collections.max(students,
                Comparator.comparingInt(s -> s.marks));

        topper.display();
    }
}
