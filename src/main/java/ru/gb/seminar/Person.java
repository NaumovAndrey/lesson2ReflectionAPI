package ru.gb.seminar;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "Name";
        this.age = 41;
    }

    public void displayInfo(){
        System.out.printf("Имя: %s; Возраст: %d\n%n", name, age);
    }
}
