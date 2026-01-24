import java.util.ArrayList;
import java.util.Arrays;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point... points) {
        if (points[0].getX() != points[points.length - 1].getX() ||
                points[0].getY() != points[points.length - 1].getY()) {
            throw new IllegalArgumentException("Это незамкнутая линия");
        }

        this.pointsArr = points;
        this.linesArr = new ArrayList<>();

        for (int i = 0; i < points.length - 1; i++) {
            Line line = new Line(points[i], points[i + 1]);
            linesArr.add(line);
        }
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public String toString() {
        return "Замкнутая Линия " + Arrays.toString(pointsArr);
    }
}