/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Skybeorn
 */
public interface RightAngleTriangleCalculatorStrategy {
    
    public void setTriangleSides(String sideA, String sideB, String sideC);
    
    public double getHypotenuse();
    
}
