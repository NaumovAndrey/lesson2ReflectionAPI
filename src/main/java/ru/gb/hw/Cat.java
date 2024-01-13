package ru.gb.hw;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Мяяяяу");
    }

    void jump(){
        System.out.println("кыса куда-то запрыгнула");
    }
}
