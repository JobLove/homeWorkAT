package ru.сourses.main;



import ru.сourses.collectionsTask.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    static void main(String[] args) throws Exception {

        //10.1
        int size = 4;
        List<Integer> listInt = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            listInt.add(i);
        }

        Module10.listPairChange(listInt);

        //10.2
        Module10.bubbleSort(new int[]{1, 3, 2, 5, 4, 6});

        //10.3
        Module10.reverse(new int[]{1, 3, 2, 5, 4, 6});
        Module10.reverse(new ArrayList<>(Arrays.asList(1, 2, 4, 5, 6)));
    }
}


