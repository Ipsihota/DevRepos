package com.practice.demo.stream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.Optional;

public class StreamOptionalStudentExample {
    // Display count of books of student with some condition!!!
    private static int getNoOfNoteBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()<=3)
                .filter(student -> student.getGender().equalsIgnoreCase("male"))
                .map(Student::getNoteBooks)
                .reduce((a,b) -> a+b).get();
//                .reduce(Integer::sum).get(); In case we do not have built in operation then above way need to be applied!
    }

    //student details who got highest GPA
    private static Optional<Student> getHighestGPA(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((p,q)->p.getGpa()>q.getGpa()?p:q);
    }

    public static void main(String[] args) {
        System.out.println("NoOfNoteBooks: "+getNoOfNoteBooks());
        System.out.println("HighestGPA: "+getHighestGPA().get());
    }
}
