public class ClosedPolyLine extends PolyLine {

    public ClosedPolyLine(Point ...points){
        if (points[0].getX() != points[points.length-1].getX() ||
                points[0].getY() != points[points.length-1].getY()){
            throw new IllegalArgumentException("Это незамкнутая линия");
        }

        this.points = points;
    }

    @Override
    public double length() {
        return super.length();
    }
}
