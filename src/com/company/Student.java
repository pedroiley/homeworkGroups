package com.company;

public class Student extends Person{
    private boolean hasPreviousJavaKnowledge;

    public Student(String firstName, String lastName, int age, boolean hasPreviousJavaKnowledge) {
        super(firstName, lastName, age);
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    public boolean isHasPreviousJavaKnowledge() {
        return hasPreviousJavaKnowledge;
    }

    public void setHasPreviousJavaKnowledge(boolean hasPreviousJavaKnowledge) {
        this.hasPreviousJavaKnowledge = hasPreviousJavaKnowledge;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() + ", hasPreviousJavaKnowledge='" + hasPreviousJavaKnowledge + '\'' +
                '}';
    }


}
