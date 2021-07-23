package com.practice.demo.stream;

import com.practice.demo.data.Student;
import com.practice.demo.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        //Display List of activities of students
        List<String>activityList = getStudentActivities();
        System.out.println("Activity List: " + activityList);
    }

    protected static List<String> getStudentActivities() {
        return StudentDataBase.getAllStudents().stream() //Stream<Student>
        .map(Student::getActivities) // Stream<List<List<String>>>
                .flatMap(List::stream) // Stream<String> , to flatten up stream
        .collect(toList());
    }
}
