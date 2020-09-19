package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Student1", "lastname1", 23, true));
        listOfStudents.add(new Student("Student2", "lastname1", 33, false));
        listOfStudents.add(new Student("Student3", "lastname1", 43, true));
        listOfStudents.add(new Student("Student4", "lastname1", 53, false));
        listOfStudents.add(new Student("Student5", "lastname1", 63, true));
        listOfStudents.add(new Student("Student6", "lastname1", 28, false));
        listOfStudents.add(new Student("Student7", "lastname1", 38, true));
        listOfStudents.add(new Student("Student8", "lastname1", 45, false));
        listOfStudents.add(new Student("Student9", "lastname1", 18, true));
        listOfStudents.add(new Student("Student10", "lastname1", 17, false));
        listOfStudents.add(new Student("Student11", "lastname1", 21, true));
        listOfStudents.add(new Student("Student12", "lastname1", 56, false));
        listOfStudents.add(new Student("Student13", "lastname1", 67, true));
        listOfStudents.add(new Student("Student14", "lastname1", 121, false));
        listOfStudents.add(new Student("Student15", "lastname1", 29, true));


        Trainer trainer1 = new Trainer("Trainer1", "lastname1", 43, true);
        Trainer trainer2 = new Trainer("Trainer2", "lastname1", 23, false);
        Trainer trainer3 = new Trainer("Trainer3", "lastname1", 53, true);



        Group group1 = new Group("Group1", trainer1, listOfStudents.stream()
                .filter( student -> student.getAge()<20)
        .collect(Collectors.toList()));

        System.out.println(group1);
//        Group group2 = new Group("Group2");
//        Group group3 = new Group("Group3");
//        Group group4 = new Group("Group4");

    }
}
