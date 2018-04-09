/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
import org.apache.commons.math3.stat.inference.ChiSquareTest;
/**
 *
 * @author Emiliano Cervantes
 */
public class ChiSquare {
    private double alpha;
    private long[] observedData;
    private double[] expectedCounts;
    ChiSquareTest cst = new ChiSquareTest();
    
    public ChiSquare(double alpha,long[] observedData, double[] expectedCounts){
        this.alpha = alpha;
        this.observedData = observedData;
        this.expectedCounts = expectedCounts;
    }
    
    public void test(){
        cst.chiSquareTest(expectedCounts, observedData, alpha);
    }
}
