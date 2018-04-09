/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;
//import org.apache.commons.math3.stat.inference.ChiSquareTest;
import java.util.Arrays;
import java.lang.Math;
/**
 *
 * @author Emiliano Cervantes
 */
public class ChiSquare {
    private double alpha;
    private double[] observedData;
    private String[][] result, resultTemp;
    private double sumFEOi=0;
    private double theoH0;
    
    public ChiSquare(double alpha,double[] observedData){
        this.alpha = alpha;
        this.observedData = observedData;
        this.result = new String[0][6];
    }
    
    public void calculate(){
        int numOfData, libertyDegrees, classesCeil;
        double max, min, numOfClasses, classRange, classValue, classValue2, mu=0, lambda, FEi;
        Arrays.sort(observedData);
        min = observedData[0];
        classValue = min;
        max = observedData[observedData.length-1];
        numOfData = observedData.length;
        numOfClasses = 1 + 3.322 * Math.log10(numOfData);
        classesCeil = (int) Math.ceil(numOfClasses);
        libertyDegrees = classesCeil - 2;
        classRange = (max-min)/classesCeil;
        classValue2 = classValue + classRange;
        for(int i = 1; i<=classesCeil;i++){
            int count = search(classValue,classValue2);
            pushResult(i, classValue,classValue2,count,count/numOfData);
            classValue=classValue2;
            classValue2+=classRange;
        }
        
        for(int i=0;i<observedData.length;i++){
            mu+=observedData[i];
        }
        mu=mu/observedData.length;
        lambda=1/mu;
        
        for(int i = 1; i<=libertyDegrees;i++){
            int count = search(classValue,classValue2);
            FEi = 
            pushResult(i, classValue,classValue2,count,count/numOfData);
            classValue=classValue2;
            classValue2+=classRange;
        }
        
        getTheoreticalH0(alpha);
    }
    
    public int search(double a, double b) {
        double temp=0;
        int i=0;
        while(temp<=b){
            temp = observedData[i];
            if(temp > a && temp <=b){
                i++;
            }
        }
        return i;
    }
    
    private void pushResult(int k, double classMin, double classMax, double FOiABs, double FOiRel) {
        resultTemp = result;
        int size = resultTemp.length;
        result = new String[size + 1][4];

        for (int i = 0; i < size; i++) {
            System.arraycopy(resultTemp[i], 0, result[i], 0, 6);
        }
        result[size][0] = k + "";
        result[size][1] = classMin + " - " + classMax;
        result[size][2] = FOiABs + "";
        result[size][3] = FOiRel + "";
    }
    private void pushResult(int k, double classMin, double classMax, double FOiABs, double FOiRel, double FEi, double FEOi){
        resultTemp = result;
        int size = resultTemp.length;
        result = new String[size + 1][4];

        for (int i = 0; i < size; i++) {
            System.arraycopy(resultTemp[i], 0, result[i], 0, 6);
        }
        result[size][0] = k + "";
        result[size][1] = classMin + " - " + classMax;
        result[size][2] = FOiABs + "";
        result[size][3] = FOiRel + "";
        result[size][4] = FEi + "";
        result[size][5] = FEOi + "";
    }

    private boolean isOnArray(long x) {
        boolean flag = false;
        for (int i = 0; i < result.length; i++) {
            if (Long.parseLong(result[i][3]) == x) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public String[][] getArray() {
        return result;
    }

    private void printArray() {
        for (String[] array : result) {
            for (String element : array) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
        System.out.println("Suma (FEi-FOi)^2 / FEi es igual a "+sumFEOi);
        if(sumFEOi < theoH0){
            System.out.println("H0 se acepta");
        } else {
            System.out.println("H0 no se acepta");
        }
    }
    
    private double integral(double max, double min, double lambda){
        //
    }
    
    private void getTheoreticalH0(double alpha){
        switch(alpha){
            case 0.5:
                break;
            case 0.25:
                break;
            case 0.1:
                break;
            case 0.05:
                break;
            case 0.025:
                break;
            case 0.01:
                break;
            case 0.005:
                break;
            case 0.001:
                break;
            default:
                break;
        }
    }
}
