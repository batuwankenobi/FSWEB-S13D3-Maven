package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String occupation;
    double salary;
    String favActivity;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String occupation, double salary, String favActivity) {
        this(firstName, lastName, age);
        this.occupation = occupation;
        this.salary = salary;
        this.favActivity = favActivity;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return (this.age >= 13 && this.age <= 19);
    }
}