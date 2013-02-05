package Model;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skybeorn
 */
public interface AreaCalculatorStrategy {

    public abstract double getArea();

    public abstract void setRadius(String circleRadius);
    
    public abstract void setRectangleSides(String Length, String Width);
}
