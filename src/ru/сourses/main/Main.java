package ru.сourses.main;

import ru.сourses.geometry.PolyLine;
import ru.сourses.geometry.Point;
import ru.сourses.geometry.Line;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Main {
    static void main(String[] args) throws Exception {

        Sauce sauce = new Sauce("Острый соус", Spiciness.SPICY);
        System.out.println(sauce);

    }

    public static double powXY(String x, String y) {
        int baseX = parseInt(x);
        int powY = parseInt(y);

        return pow(baseX, powY);
    }

    static double sumAll(double... summands) {
        double sum = 0;

        for (double summand : summands) {
            sum += summand;
        }

        return sum;
    }
}


