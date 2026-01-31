package ru.сourses.main;



import ru.сourses.collectionsTask.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;


public class Main {
    static void main(String[] args) throws Exception {

//10.2.1
        Stream<String> stream = Stream.of("Hello", "world", "from", "stream");
        System.out.println("10.2.1: " + Module10.getStringFromStream(stream));

        //10.2.2
        Module10.printList(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6)));
    }
}


