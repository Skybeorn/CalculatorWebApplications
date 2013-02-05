/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Skybeorn
 */
public class CircularArea implements AreaCalculatorStrategy {

    private double area = 0;
    private double radius = 0;
    private String BAD_ARGUMENT = "Radius can not be Null or Empty!!";

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
        area = Math.PI * radius * radius;
    }

    @Override
    public void setRectangleSides(String sideOne, String sideTwo) {
    }
}