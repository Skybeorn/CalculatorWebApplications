/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Skybeorn
 */
public class MissingHypotenuseCalculator implements
        RightAngleTriangleCalculatorStrategy {

    private double triangleLegA = 0;
    private double triangleLegB = 0;
    private double triangleLegC = 0;
    private String NULL_OR_EMPTY_STRING = "Side Value can not be null or Empty";
    private int ZERO = 0;

    @Override
    public void setTriangleSides(String sideA, String sideB, String sideC) {

        if (sideA == null || sideA.length() == ZERO) {
            throw new IllegalArgumentException(NULL_OR_EMPTY_STRING);
        } else {
            String x = sideA;
            double convertedSideA = new Double(x);
            triangleLegA = convertedSideA;
        }

        if (sideB == null || sideB.length() == ZERO) {
            throw new IllegalArgumentException(NULL_OR_EMPTY_STRING);
        } else {
            String x = sideB;
            double convertedSideB = new Double(x);
            triangleLegB = convertedSideB;
        }

  

    }
}
