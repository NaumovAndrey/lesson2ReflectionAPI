package ru.gb.lesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> car = Class.forName("ru.gb.lesson.Car");
        Constructor<?>[] constructors = car.getConstructors();
        //System.out.println(Arrays.toString(constructors));

        Object gaz = constructors[0].newInstance("gaz");
        System.out.println(gaz);

        Field[] fields = gaz.getClass().getFields();
        int tmp = fields[fields.length-1].getInt(gaz);
        fields[fields.length-1].setInt(gaz, tmp*2);

        System.out.println(gaz);

        Method[] methods = car.getDeclaredMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i]);
        }
    }
}