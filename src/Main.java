import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static void main(String[] args) {
       /*
        //6.1
        Point p1 = new Point(1, 3);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(5, 8);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1 == p2: " + compare2points(p1, p2));
        System.out.println("p1 == p3: " + compare2points(p1, p3));
        System.out.println("p2 == p3: " + compare2points(p2, p3));


        //6.2
        Point startPoint = new Point(1, 3);
        Point endPoint = new Point(5, 8);

        Line line1 = new Line(startPoint, endPoint);
        Line line2 = new Line(10, 11, 15, 19);
        Line line3 = new Line(line1.pointEnd, line2.pointStart);

        System.out.println("До: Line3 - " + line3.toString());

        line3.pointStart.setX(6);
        line3.pointStart.setY(9);

        line3.pointEnd.setX(11);
        line3.pointEnd.setY(12);

        System.out.println("После: Line3 - " + line3.toString());

        double lengthSum = line1.getLength() + line2.getLength() + line3.getLength();
        System.out.println("Суммарная длина всех трех линий: " + lengthSum);
        */

//6.3
        PolyLine polyLine = new PolyLine(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(9, 9));

        System.out.println("До PolyLine: " + polyLine.toString());
        System.out.println("Длина ломанной: " + polyLine.getLength());

        Line[] lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));

        double lengthSum = 0;

        for (Line line : lines) {
            lengthSum += line.getLength();
        }
        System.out.println("Суммарная длина линий: " + lengthSum);
        System.out.println("Длина ломанной равна суммарной длине линий: " + (polyLine.getLength() == lengthSum));

        polyLine.pointsArr[1].setX(12);

        System.out.println("После PolyLine: " + polyLine.toString());
        lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));
    }

    public static boolean compare2points(Point p1, Point p2) { return (p1.getX() == p2.getX() && p1.getY() == p2.getY()); }
}


