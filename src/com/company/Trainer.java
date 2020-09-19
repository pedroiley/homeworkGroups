package com.company;

public class Trainer extends Person{
    private boolean isAuthorized;

    public Trainer(String firstName, String lastName, int age, boolean isAuthorized) {
        super(firstName, lastName, age);
        this.isAuthorized = isAuthorized;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void setAuthorized(boolean authorized) {
        this.isAuthorized = authorized;


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() + ", isAuthorized='" + isAuthorized + '\'' +
                '}';
    }
}
