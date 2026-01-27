package ru.сourses.geometry;

import java.util.Objects;

public class Line implements Measurable {

    Point pointStart;
    Point pointEnd;

    public Line(Point point1, Point point2) {
        this.pointStart = point1;
        this.pointEnd = point2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.pointStart = new Point(x1,y1);
        this.pointEnd = new Point(x2,y2);
    }

    @Override
    public String toString() {
        return "Линия от " + this.pointStart.toString() +" до " + this.pointEnd.toString();
    }

    public double getLength() {
        int deltaX = this.pointEnd.getX() - this.pointStart.getX();
        int deltaY = this.pointEnd.getY() - this.pointStart.getY();
        double length = Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        return Math.round(length * 1000) / 1000d;
    }

    @Override
    public Line clone() {
        Line line = new Line(pointStart,pointEnd);
        return line;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(pointStart, line.pointStart) && Objects.equals(pointEnd, line.pointEnd);
    }

    @Override
    public int hashCode(){
        return Objects.hash(pointStart,pointEnd);
    }

}
