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
        System.out.println("Суммарная длина всех трех линий: " + lengthSum);*/

//6.3
        PolyLine polyLine = new PolyLine(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(9, 9));

        System.out.println("До PolyLine: " + polyLine);
        System.out.println("Длина ломанной: " + polyLine.getLength());
/*
        Line[] lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));

        double lengthSum = 0;

        for (Line line : lines) {
            lengthSum += line.getLength();
        }
        System.out.println("Суммарная длина линий: " + lengthSum);
        System.out.println("Длина ломанной равна суммарной длине линий: " + (polyLine.getLength() == lengthSum));

        polyLine.pointsArr[1].setX(12);

        System.out.println("После PolyLine: " + polyLine);
        lines = polyLine.getLines();
        System.out.println("Массив линий: " + Arrays.toString(lines));
*/
        ClosedPolyLine closedPolyLine = new ClosedPolyLine(
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(9, 9),
                new Point(1, 5));

        System.out.println(closedPolyLine);
        System.out.println("Длина замкнутой ломанной: " + closedPolyLine.getLength());

        System.out.println("-----printMeasurable-----");
        printMeasurable(polyLine, closedPolyLine);

        /*
        // 7.1
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);

        Fraction frSum = f1.sum(f2).sum(f3).minus(5);
        System.out.println(frSum.toString());


        Student student1 = new Student("Sam", 2, 5, 5);
        Student student2 = new Student("Max");
        System.out.println("Студент1 " + student1);
        System.out.println("Студент2 " + student2);

        student1.addGrade(4);
        student2.addGrade(2);
        student2.addGrade(3);
        System.out.println(student1);
        System.out.println(student2);
        student2.addGrade(4);
        student2.addGrade(5);
        student2.addGrade(3);
        System.out.println(student2);
        System.out.println("Оценки второго студента: " + student2.getGrades());
        */
    }

    static void printMeasurable(Measurable... shapes) {
        for (Measurable shape : shapes) {
            System.out.println(shape);
            System.out.println("Длина: " + shape.getLength());
        }
    }
}


