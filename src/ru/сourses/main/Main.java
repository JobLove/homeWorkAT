package ru.сourses.main;

import ru.сourses.math.Fraction;

import java.awt.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Main {
    static void main(String[] args) {
        if(args.length>2) throw new IllegalArgumentException("Передано больше 2х аругментов");
       //8.6
        double sum = sumAll(2,
                new Fraction(3,5).doubleValue(),
                2.3);
        System.out.println("Sum: "+ sum);

        sum = sumAll(3.6,
                new Fraction(49,12).doubleValue(),
                3,
                new Fraction(3,2).doubleValue());
        System.out.println("Sum: "+ sum);

        sum = sumAll(new Fraction(1,3).doubleValue(),
                1);
        System.out.println("Sum: "+ sum);

        //8.15

        System.out.println("pow(2,3):" + powXY(args[0], args[1]));

        //8.16
        ru.сourses.geometry.Point pointGeometry = new ru.сourses.geometry.Point(2, 3);
        System.out.println("ru.сourses.geometry.Point: " + pointGeometry);

        Point pointAwt = new Point(3, 4);
        System.out.println(pointAwt);
    }

    public static double powXY(String x, String y) {
        int baseX = parseInt(x);
        int powY = parseInt(y);

        return pow(baseX, powY);
    }

    static double sumAll(double ...summands){
        double sum = 0;

        for(double summand : summands){
            sum += summand;
        }

        return sum;
    }
}


