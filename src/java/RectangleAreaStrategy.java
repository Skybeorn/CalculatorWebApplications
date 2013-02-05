/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Skybeorn
 */
public class RectangleAreaStrategy implements AreaCalculatorStrategy {

    double area = 0;
    double sideOne = 0; 
    double sideTwo = 0;
    
    
    @Override
    public double getArea() {
      return area;  
    }

    public void setAreaCriteria(double x, double y) {
        sideOne = x;
        sideTwo = y;
        
    }
    
}
