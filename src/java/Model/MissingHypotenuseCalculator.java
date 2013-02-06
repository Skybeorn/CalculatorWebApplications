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
        TriangleCalculatorStrategy {

    private double triangleLegA = 0;
    private double triangleLegB = 0;
    private double triangleLegC = 0;
    private String NULL_OR_EMPTY_STRING = "Side can not be null or Empty";

    @Override
    public void setTriangleSides(String sideA, String sideB, String sideC) {

        if (sideA == null || sideA.length() == 0) {
            throw new IllegalArgumentException(NULL_OR_EMPTY_STRING);
        } else {
            String x = sideA;
            double convertedSideA = new Double(x);
            triangleLegA = convertedSideA;
        }

        if (sideB == null || sideB.length() == 0) {
            throw new IllegalArgumentException(NULL_OR_EMPTY_STRING);
        } else {
            String x = sideB;
            double convertedSideB = new Double(x);
            triangleLegB = convertedSideB;
        }

    }
}
