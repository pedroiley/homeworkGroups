package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Trainer trainer;
    private List<Student> studentList;

    public Group(String name, Trainer trainer, List<Student> students) {
        this.name = name;
        this.trainer = trainer;
        this.studentList = new ArrayList<>();
        this.studentList = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", trainer=" + trainer +
                ", students=" + studentList +
                '}';
    }
}
