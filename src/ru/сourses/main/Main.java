package ru.сourses.main;


import ru.сourses.collectionsTask.*;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    static void main(String[] args) throws Exception {

        //10.3
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println("10.3: " + cat);
        Module10.resetClass(cat);
        System.out.println(cat);

        Dog dog = new Dog("Moscow", "Jack", 3);
        System.out.println(dog);
        Module10.resetClass(dog);
        System.out.println(dog);
    }
}


