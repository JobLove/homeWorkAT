package ru.сourses.main;

import ru.сourses.geometry.PolyLine;
import ru.сourses.geometry.Point;
import ru.сourses.geometry.Line;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;


public class Main {
    static void main(String[] args) throws Exception {

        //task 9.1.2
        System.out.println("Solve task 9.1.2:");
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(1, 3);
        Point pointClone = p1.clone();

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(pointClone));

        //task 9.1.3
        System.out.println();
        System.out.println("Solve task 9.1.3:");
        Line l1 = new Line(new Point(1, 2),
                new Point(2, 3));
        Line l2 = new Line(1, 2, 2, 3);
        Line lClone = l1.clone();

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(lClone));

        //task 9.1.4
        System.out.println();
        System.out.println("Solve task 9.1.4:");
        PolyLine pl1 = new PolyLine(new Point(1, 2),
                new Point(2, 3),
                new Point(3, 4));

        PolyLine pl2 = new PolyLine(new Point(1, 2),
                new Point(2, 3),
                new Point(3, 4));

        PolyLine pl3 = new PolyLine(new Point(1, 2),
                new Point(2, 3),
                new Point(4, 4));

        PolyLine plClone = pl1.clone();

        System.out.println(pl1.equals(pl2));
        System.out.println(pl1.equals(pl3));
        System.out.println(pl1.equals(plClone));
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


