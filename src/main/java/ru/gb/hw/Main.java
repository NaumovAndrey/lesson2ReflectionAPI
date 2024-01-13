package ru.gb.hw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    /**
     *  Создайте абстрактный класс "Animal" с полями "name" и "age".
     * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
     * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
     * Выведите на экран информацию о каждом объекте.
     * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
     */
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Nala", 2, "Labrador retriever");
        animals[1] = new Cat("Mers", 6);
        animals[2] = new Cat("Busya", 5);

        for (Animal animal : animals) {
            Class<? extends Animal> animalClass = animal.getClass();
            Field[] fields = animalClass.getDeclaredFields();

            System.out.println("Информация о " + animal.getClass().getSimpleName() + ":");
            for (Field field : fields) {
                field.setAccessible(true);
                try {
                    System.out.println(field.getName() + ": " + field.get(animal));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Name: " + animal.getName());
            System.out.println("Age: " + animal.getAge());
            animal.makeSound();
            System.out.println();
        }
    }
}