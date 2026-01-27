package ru.сourses.main;

import ru.сourses.geometry.PolyLine;
import ru.сourses.geometry.Point;
import ru.сourses.geometry.Line;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Main {
    static void main(String[] args) throws Exception {

        double sum = 0;

        for (String arg : args) {
            if (isDigit(arg)) {
                double numDouble = Double.parseDouble(arg);
                sum += numDouble;
            }
        }

        System.out.println("Сумма: " + sum);

    }

    public static boolean isDigit(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        int dotCount = 0;
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                dotCount++;
                if (dotCount > 1) return false;
            } else if (c == '-' || c == '+') {
                if (i != 0) return false;
            } else if (Character.isDigit(c)) {
                digitCount++;
        } else {
                return false;
            }
    }

        return digitCount >0;
}

    /*public static double powXY(String x, String y) {
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
    }*/
}


