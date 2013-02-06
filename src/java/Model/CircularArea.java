package Model;

public class CircularArea implements AreaCalculatorStrategy {

    private double area = 0;
    private double radius = 0;
    private String BAD_ARGUMENT = "Radius can not be Null or Empty!!";
    private String RADIUS_EQUAL_TO_ZERO = "It is impossibile for a circle to"
            + " have an Area Value when the radisu is Zero";

    public CircularArea() {
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setRadius(String circleRadius) {
        if (circleRadius == null || circleRadius.length() == 0) {
            throw new IllegalArgumentException(BAD_ARGUMENT);
        } else {
            String x = circleRadius;
            Double convertedRadius = new Double(x);
            radius = convertedRadius;
        }
        if (radius == 0) {
            throw new IllegalArgumentException(RADIUS_EQUAL_TO_ZERO);
        } else {
            area = Math.PI * radius * radius;
        }

    }

    @Override
    public void setRectangleSides(String sideOne, String sideTwo) {
    }
}