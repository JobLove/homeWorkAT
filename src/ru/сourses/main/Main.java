package ru.сourses.main;

import ru.сourses.geometry.PolyLine;
import ru.сourses.geometry.Point;
import ru.сourses.geometry.Line;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Main {
    static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числа через пробел: ");
        String inputStr = scanner.nextLine();
        String[] nums = inputStr.split(" ");

        double sum = 0;

        for (String num : nums) {
            double numDouble;
            try {
                numDouble = Double.parseDouble(num);
            } catch (NumberFormatException e) {
                numDouble = 0;
            }

            sum += numDouble;
        }

        System.out.println("Сумма: " + sum);

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


