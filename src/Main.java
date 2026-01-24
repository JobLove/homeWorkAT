import java.io.File;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static void main(String[] args) {
        // 8.1
        Point point2d = new Point(2, 3);
        System.out.println("Point2D: " + point2d);
        Point point3d = new Point3D(3, 4, 5);
        System.out.println("Point3D: " + point3d);

        //8.2
        Point point1 = new Point(1, 3);
        Point point2 = new Point(2, 4);
        Point point3 = new Point(3, 5);

        PolyLine polyLine = new PolyLine(point1,point2, point3);
        System.out.println(polyLine.length());

        ClosedPolyLine closedPolyLine = new ClosedPolyLine(point1,point2, point3,point1);
        System.out.println(closedPolyLine.length());

        //8.3

    }

    public static boolean compare2points(Point p1, Point p2) {
        return (p1.getX() == p2.getX() && p1.getY() == p2.getY());
    }
}


