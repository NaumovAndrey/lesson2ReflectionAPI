package ru.gb.hw;

public class Dog extends Animal{
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гаф");
    }

    void run(){
        System.out.println("собачка куда-то побежала");
    }
}
