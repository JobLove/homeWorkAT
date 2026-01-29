package ru.сourses.main;

import ru.сourses.math.Fraction;

import java.awt.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Main {
    static void main(String[] args) {

        if (args.length > 2) throw new IllegalArgumentException("Передано больше 2х аругментов");
        System.out.println("pow(2,3):" + powXY(args[0], args[1]));

    }

    public static double powXY(String x, String y) {
        int baseX = parseInt(x);
        int powY = parseInt(y);

        return pow(baseX, powY);
    }
}


