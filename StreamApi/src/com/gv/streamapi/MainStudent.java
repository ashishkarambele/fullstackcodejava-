package com.gv.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class MainStudent {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        studentArray[0] = new Student(1, 22, "Anushka");
        studentArray[1] = new Student(2, 22, "Harshali");
        studentArray[2] = new Student(3, 21, "Nimisha");
        studentArray[3] = new Student(4, 21, "Rahul");
        studentArray[4] = new Student(5, 23, "Sagar");

        // Filter Function, Map Function, ForEach Function
        Stream<Student> studentStream = Arrays.stream(studentArray);

        Optional<String> firstMaxName = studentStream
                .map(Student::getName)
                .max(Comparator.naturalOrder());

        firstMaxName.ifPresent(name -> System.out.println("First Max Name: " + name));

        // You cannot reuse the closed stream. Hence, recreate the stream.
        studentStream = Arrays.stream(studentArray);

        // Assignment: Print even roll numbers
        studentStream
                .map(Student::getRollno)
                .filter(rollno -> rollno % 2 == 0)
                .forEach(rollno -> System.out.println("Even RollNo: " + rollno));

        // You cannot reuse the closed stream. Hence, recreate the stream.
        studentStream = Arrays.stream(studentArray);

        studentStream
                .filter(student -> student.getAge() > 21)
                .forEach(student -> System.out.println("Age greater than 21: " + student.getAge()));

        // You cannot reuse the closed stream. Hence, recreate the stream.
        studentStream = Arrays.stream(studentArray);

        // Distinct, Sorted, Skip Function
        studentStream
                .map(Student::getAge)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .forEach(age -> System.out.println("Age: " + age));
    }
}
