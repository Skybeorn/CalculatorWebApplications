package Model;

public class RectangularArea implements AreaCalculatorStrategy {

    private double area = 0;
    private double sideOne = 0;
    private double sideTwo = 0;
    private String BAD_ARGUMENT = "Radius can not be Null or Empty!!";
    private String SIDE_EQUAL_TO_ZERO = "It is impossibile for a Rectangle to"
            + " have an Area Value when a side is Zero";

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setRadius(String circleRadius) {
    }

    @Override
    public void setRectangleSides(String length, String width) {
        if (length == null || length.length() == 0) {
            throw new IllegalArgumentException(BAD_ARGUMENT);
        } else {
            String x = length;
            double convertedRadius = new Double(x);
            sideOne = convertedRadius;
        }

        if (width == null || width.length() == 0) {
            throw new IllegalArgumentException(BAD_ARGUMENT);
        } else {
            String x = width;
            double convertedRadius = new Double(x);
            sideTwo = convertedRadius;
        }

        if (sideOne == 0 && sideTwo == 0) {
            throw new IllegalArgumentException(SIDE_EQUAL_TO_ZERO);
        } else {
            area = sideOne * sideTwo;
        }


    }
}
