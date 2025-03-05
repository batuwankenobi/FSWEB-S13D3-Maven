package org.example;

public class Main {
    public static void main(String[] args) {

        // System.out.println("Hello world");
        Person person = new Person("John", "Doe", 20);

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());

        Person person2 = new Person("Jane", "Doe", 18, "student", 0, "trekking");

        System.out.println("First Name: " + person2.getFirstName());
        System.out.println("Last Name: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}