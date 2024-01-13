package ru.gb.seminar;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task1 {
    /**
    Получить информацию о классе Person с использованием Reflection API (вывести на экран все поля и методы класса)
    Создать экземпляр класса Person с использованием Reflection API, установить значения полей и вызвать методы
    Реализовать обработку исключений для обеспечения корректного взаимодействия с Reflection API
    */
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException {
        Class<?> personalClass = Class.forName("ru.gb.seminar.Person");

        /**
         * Получить список всех полей
         */
        Field[] fields = personalClass.getDeclaredFields();
        for (Field field:fields) {
            System.out.println("Поле: " + field.getName());
        }

        /**
         * получить список всех конструкторов
         */
        Constructor[] constructors = personalClass.getConstructors();

        /**
         * Создать экземпляр класса
         */
        Object pesonInstance = constructors[0].newInstance(null);

        /**
         * Установить значеение полей
         */
        Field nameField = personalClass.getDeclaredField("name");
        nameField.setAccessible(true); //разрешить доступ к закрытому полю
        nameField.set(pesonInstance, "Alice");

        /**
         * Вызов метода
         */
        Method displayInfoMethod = personalClass.getDeclaredMethod("displayInfo");
        displayInfoMethod.invoke(pesonInstance);
    }
}
