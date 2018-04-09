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
    private int libertyDegrees;
    
    public ChiSquare(double alpha,double[] observedData){
        this.alpha = alpha;
        this.observedData = observedData;
        this.result = new String[0][6];
    }
    
    public void calculate(){
        int numOfData, classesCeil;
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
            FEi = integral(classValue, classValue2, lambda);
            pushResult(i, classValue,classValue2,count,count/numOfData);
            classValue=classValue2;
            classValue2+=classRange;
        }
        libertyDegrees-=2;
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
        return 1.0;
    }
    
    private void getTheoreticalH0(double alpha){
        //0.2, 0.1, 0.05, 0.02, 0.01, 0.005, 0.002 o 0.001
        int alfa = (int)alpha*1000;
        switch(alfa){
            case 200:
                if(libertyDegrees == 1){
                    theoH0=1.6424;
                } else if(libertyDegrees == 2){
                    theoH0=3.2189;
                } else if(libertyDegrees == 3){
                    theoH0=4.6416;
                } else if (libertyDegrees == 4) {
                    theoH0 = 5.9886;
                } else if (libertyDegrees == 5) {
                    theoH0 = 7.2893;
                } else if (libertyDegrees == 6) {
                    theoH0 = 8.5581;
                } else if (libertyDegrees == 7) {
                    theoH0 = 9.8032;
                } else if (libertyDegrees == 8) {
                    theoH0 = 11.0301;
                } else if (libertyDegrees == 9) {
                    theoH0 = 12.2421;
                } else if (libertyDegrees == 10) {
                    theoH0 = 13.442;
                } else if (libertyDegrees == 11) {
                    theoH0 = 14.6314;
                } else if (libertyDegrees == 12) {
                    theoH0 = 15.812;
                } else if (libertyDegrees == 13) {
                    theoH0 = 16.9848;
                } else if (libertyDegrees == 14) {
                    theoH0 = 18.1508;
                } else if (libertyDegrees == 15) {
                    theoH0 = 19.3107;
                } else if (libertyDegrees == 16) {
                    theoH0 = 20.4651;
                } else if (libertyDegrees == 17) {
                    theoH0 = 21.6146;
                } else if (libertyDegrees == 18) {
                    theoH0 = 22.7595;
                } else if (libertyDegrees == 19) {
                    theoH0 = 23.9004;
                } else if (libertyDegrees == 20) {
                    theoH0 = 25.0375;
                } else if (libertyDegrees == 21) {
                    theoH0 = 26.1711;
                } else if (libertyDegrees == 22) {
                    theoH0 = 27.3015;
                } else if (libertyDegrees == 23) {
                    theoH0 = 28.4288;
                } else if (libertyDegrees == 24) {
                    theoH0 = 29.5533;
                } else if (libertyDegrees == 25) {
                    theoH0 = 30.6752;
                } else if (libertyDegrees == 26) {
                    theoH0 = 31.7946;
                } else if (libertyDegrees == 27) {
                    theoH0 = 32.9117;
                } else if (libertyDegrees == 28) {
                    theoH0 = 34.0266;
                } else if (libertyDegrees == 29) {
                    theoH0 = 35.1394;
                }
                break;
            case 100:
                if(libertyDegrees == 1){
                    theoH0=2.7055;
                } else if(libertyDegrees == 2){
                    theoH0=4.6052;
                } else if(libertyDegrees == 3){
                    theoH0=6.2514;
                } else if (libertyDegrees == 4) {
                    theoH0 = 7.7794;
                } else if (libertyDegrees == 5) {
                    theoH0 = 9.2363;
                } else if (libertyDegrees == 6) {
                    theoH0 = 10.6446;
                } else if (libertyDegrees == 7) {
                    theoH0 = 12.017;
                } else if (libertyDegrees == 8) {
                    theoH0 = 13.3616;
                } else if (libertyDegrees == 9) {
                    theoH0 = 14.6837;
                } else if (libertyDegrees == 10) {
                    theoH0 = 15.9872;
                } else if (libertyDegrees == 11) {
                    theoH0 = 17.2750;
                } else if (libertyDegrees == 12) {
                    theoH0 = 18.5493;
                } else if (libertyDegrees == 13) {
                    theoH0 = 19.8119;
                } else if (libertyDegrees == 14) {
                    theoH0 = 21.0641;
                } else if (libertyDegrees == 15) {
                    theoH0 = 22.3071;
                } else if (libertyDegrees == 16) {
                    theoH0 = 23.5418;
                } else if (libertyDegrees == 17) {
                    theoH0 = 24.769;
                } else if (libertyDegrees == 18) {
                    theoH0 = 25.9894;
                } else if (libertyDegrees == 19) {
                    theoH0 = 27.2036;
                } else if (libertyDegrees == 20) {
                    theoH0 = 28.412;
                } else if (libertyDegrees == 21) {
                    theoH0 = 29.6151;
                } else if (libertyDegrees == 22) {
                    theoH0 = 30.8133;
                } else if (libertyDegrees == 23) {
                    theoH0 = 32.0069;
                } else if (libertyDegrees == 24) {
                    theoH0 = 33.1962;
                } else if (libertyDegrees == 25) {
                    theoH0 = 34.3816;
                } else if (libertyDegrees == 26) {
                    theoH0 = 35.5632;
                } else if (libertyDegrees == 27) {
                    theoH0 = 36.7412;
                } else if (libertyDegrees == 28) {
                    theoH0 = 37.9159;
                } else if (libertyDegrees == 29) {
                    theoH0 = 39.0875;
                }
                break;
            case 50:
                if(libertyDegrees == 1){
                    theoH0 = 3.8415;
                } else if(libertyDegrees == 2){
                    theoH0 = 5.9915;
                } else if(libertyDegrees == 3){
                    theoH0 = 7.8147;
                } else if (libertyDegrees == 4) {
                    theoH0 = 9.4877;
                } else if (libertyDegrees == 5) {
                    theoH0 = 11.0705;
                } else if (libertyDegrees == 6) {
                    theoH0 = 12.5916;
                } else if (libertyDegrees == 7) {
                    theoH0 = 14.0617;
                } else if (libertyDegrees == 8) {
                    theoH0 = 15.5073;
                } else if (libertyDegrees == 9) {
                    theoH0 = 16.919;
                } else if (libertyDegrees == 10) {
                    theoH0 = 18.307;
                } else if (libertyDegrees == 11) {
                    theoH0 = 19.6752;
                } else if (libertyDegrees == 12) {
                    theoH0 = 21.0261;
                } else if (libertyDegrees == 13) {
                    theoH0 = 22.362;
                } else if (libertyDegrees == 14) {
                    theoH0 = 23.6848;
                } else if (libertyDegrees == 15) {
                    theoH0 = 24.9958;
                } else if (libertyDegrees == 16) {
                    theoH0 = 26.2962;
                } else if (libertyDegrees == 17) {
                    theoH0 = 27.5871;
                } else if (libertyDegrees == 18) {
                    theoH0 = 28.8693;
                } else if (libertyDegrees == 19) {
                    theoH0 = 30.1435;
                } else if (libertyDegrees == 20) {
                    theoH0 = 31.4104;
                } else if (libertyDegrees == 21) {
                    theoH0 = 32.6706;
                } else if (libertyDegrees == 22) {
                    theoH0 = 33.9245;
                } else if (libertyDegrees == 23) {
                    theoH0 = 35.1725;
                } else if (libertyDegrees == 24) {
                    theoH0 = 36.415;
                } else if (libertyDegrees == 25) {
                    theoH0 = 37.6525;
                } else if (libertyDegrees == 26) {
                    theoH0 = 38.88551;
                } else if (libertyDegrees == 27) {
                    theoH0 = 40.1133;
                } else if (libertyDegrees == 28) {
                    theoH0 = 41.3372;
                } else if (libertyDegrees == 29) {
                    theoH0 = 42.5569;
                }
                break;
            case 20:
                if(libertyDegrees == 1){
                    theoH0 = 5.02;
                } else if(libertyDegrees == 2){
                    theoH0 = 7.38;
                } else if(libertyDegrees == 3){
                    theoH0 = 9.35;
                } else if (libertyDegrees == 4) {
                    theoH0 = 11.14;
                } else if (libertyDegrees == 5) {
                    theoH0 = 12.83;
                } else if (libertyDegrees == 6) {
                    theoH0 = 14.45;
                } else if (libertyDegrees == 7) {
                    theoH0 = 16.01;
                } else if (libertyDegrees == 8) {
                    theoH0 = 17.53;
                } else if (libertyDegrees == 9) {
                    theoH0 = 19.02;
                } else if (libertyDegrees == 10) {
                    theoH0 = 20.48;
                } else if (libertyDegrees == 11) {
                    theoH0 = 21.92;
                } else if (libertyDegrees == 12) {
                    theoH0 = 23.34;
                } else if (libertyDegrees == 13) {
                    theoH0 = 24.74;
                } else if (libertyDegrees == 14) {
                    theoH0 = 26.12;
                } else if (libertyDegrees == 15) {
                    theoH0 = 27.49;
                } else if (libertyDegrees == 16) {
                    theoH0 = 28.85;
                } else if (libertyDegrees == 17) {
                    theoH0 = 30.19;
                } else if (libertyDegrees == 18) {
                    theoH0 = 31.53;
                } else if (libertyDegrees == 19) {
                    theoH0 = 32.85;
                } else if (libertyDegrees == 20) {
                    theoH0 = 34.17;
                } else if (libertyDegrees == 21) {
                    theoH0 = 35.48;
                } else if (libertyDegrees == 22) {
                    theoH0 = 36.78;
                } else if (libertyDegrees == 23) {
                    theoH0 = 38.08;
                } else if (libertyDegrees == 24) {
                    theoH0 = 39.36;
                } else if (libertyDegrees == 25) {
                    theoH0 = 40.65;
                } else if (libertyDegrees == 26) {
                    theoH0 = 41.92;
                } else if (libertyDegrees == 27) {
                    theoH0 = 43.19;
                } else if (libertyDegrees == 28) {
                    theoH0 = 44.46;
                } else if (libertyDegrees == 29) {
                    theoH0 = 45.72;
                }
                break;
            case 10:
                if(libertyDegrees == 1){
                    theoH0 = 
                } else if(libertyDegrees == 2){
                    theoH0 = 
                } else if(libertyDegrees == 3){
                    theoH0 = 
                } else if (libertyDegrees == 4) {
                    theoH0 = 
                } else if (libertyDegrees == 5) {
                    theoH0 = 
                } else if (libertyDegrees == 6) {
                    theoH0 = 
                } else if (libertyDegrees == 7) {
                    theoH0 = 
                } else if (libertyDegrees == 8) {
                    theoH0 = 
                } else if (libertyDegrees == 9) {
                    theoH0 = 
                } else if (libertyDegrees == 10) {
                    theoH0 = 
                } else if (libertyDegrees == 11) {
                    theoH0 = 
                } else if (libertyDegrees == 12) {
                    theoH0 = 
                } else if (libertyDegrees == 13) {
                    theoH0 = 
                } else if (libertyDegrees == 14) {
                    theoH0 = 
                } else if (libertyDegrees == 15) {
                    theoH0 = 
                } else if (libertyDegrees == 16) {
                    theoH0 = 
                } else if (libertyDegrees == 17) {
                    theoH0 = 
                } else if (libertyDegrees == 18) {
                    theoH0 = 
                } else if (libertyDegrees == 19) {
                    theoH0 = 
                } else if (libertyDegrees == 20) {
                    theoH0 = 
                } else if (libertyDegrees == 21) {
                    theoH0 = 
                } else if (libertyDegrees == 22) {
                    theoH0 = 
                } else if (libertyDegrees == 23) {
                    theoH0 = 
                } else if (libertyDegrees == 24) {
                    theoH0 = 
                } else if (libertyDegrees == 25) {
                    theoH0 = 
                } else if (libertyDegrees == 26) {
                    theoH0 = 35.5632;
                } else if (libertyDegrees == 27) {
                    theoH0 = 
                } else if (libertyDegrees == 28) {
                    theoH0 = 
                } else if (libertyDegrees == 29) {
                    theoH0 = 
                }
                break;
            case 5:
                if(libertyDegrees == 1){
                    theoH0 = 
                } else if(libertyDegrees == 2){
                    theoH0 = 
                } else if(libertyDegrees == 3){
                    theoH0 = 
                } else if (libertyDegrees == 4) {
                    theoH0 = 
                } else if (libertyDegrees == 5) {
                    theoH0 = 
                } else if (libertyDegrees == 6) {
                    theoH0 = 
                } else if (libertyDegrees == 7) {
                    theoH0 = 
                } else if (libertyDegrees == 8) {
                    theoH0 = 
                } else if (libertyDegrees == 9) {
                    theoH0 = 
                } else if (libertyDegrees == 10) {
                    theoH0 = 
                } else if (libertyDegrees == 11) {
                    theoH0 = 
                } else if (libertyDegrees == 12) {
                    theoH0 = 
                } else if (libertyDegrees == 13) {
                    theoH0 = 
                } else if (libertyDegrees == 14) {
                    theoH0 = 
                } else if (libertyDegrees == 15) {
                    theoH0 = 
                } else if (libertyDegrees == 16) {
                    theoH0 = 
                } else if (libertyDegrees == 17) {
                    theoH0 = 
                } else if (libertyDegrees == 18) {
                    theoH0 = 
                } else if (libertyDegrees == 19) {
                    theoH0 = 
                } else if (libertyDegrees == 20) {
                    theoH0 = 
                } else if (libertyDegrees == 21) {
                    theoH0 = 
                } else if (libertyDegrees == 22) {
                    theoH0 = 
                } else if (libertyDegrees == 23) {
                    theoH0 = 
                } else if (libertyDegrees == 24) {
                    theoH0 = 
                } else if (libertyDegrees == 25) {
                    theoH0 = 
                } else if (libertyDegrees == 26) {
                    theoH0 = 35.5632;
                } else if (libertyDegrees == 27) {
                    theoH0 = 
                } else if (libertyDegrees == 28) {
                    theoH0 = 
                } else if (libertyDegrees == 29) {
                    theoH0 = 
                }
                break;
            case 2:
                if(libertyDegrees == 1){
                    theoH0 = 
                } else if(libertyDegrees == 2){
                    theoH0 = 
                } else if(libertyDegrees == 3){
                    theoH0 = 
                } else if (libertyDegrees == 4) {
                    theoH0 = 
                } else if (libertyDegrees == 5) {
                    theoH0 = 
                } else if (libertyDegrees == 6) {
                    theoH0 = 
                } else if (libertyDegrees == 7) {
                    theoH0 = 
                } else if (libertyDegrees == 8) {
                    theoH0 = 
                } else if (libertyDegrees == 9) {
                    theoH0 = 
                } else if (libertyDegrees == 10) {
                    theoH0 = 
                } else if (libertyDegrees == 11) {
                    theoH0 = 
                } else if (libertyDegrees == 12) {
                    theoH0 = 
                } else if (libertyDegrees == 13) {
                    theoH0 = 
                } else if (libertyDegrees == 14) {
                    theoH0 = 
                } else if (libertyDegrees == 15) {
                    theoH0 = 
                } else if (libertyDegrees == 16) {
                    theoH0 = 
                } else if (libertyDegrees == 17) {
                    theoH0 = 
                } else if (libertyDegrees == 18) {
                    theoH0 = 
                } else if (libertyDegrees == 19) {
                    theoH0 = 
                } else if (libertyDegrees == 20) {
                    theoH0 = 
                } else if (libertyDegrees == 21) {
                    theoH0 = 
                } else if (libertyDegrees == 22) {
                    theoH0 = 
                } else if (libertyDegrees == 23) {
                    theoH0 = 
                } else if (libertyDegrees == 24) {
                    theoH0 = 
                } else if (libertyDegrees == 25) {
                    theoH0 = 
                } else if (libertyDegrees == 26) {
                    theoH0 = 35.5632;
                } else if (libertyDegrees == 27) {
                    theoH0 = 
                } else if (libertyDegrees == 28) {
                    theoH0 = 
                } else if (libertyDegrees == 29) {
                    theoH0 = 
                }
                break;
            case 1:
                if(libertyDegrees == 1){
                    theoH0 = 
                } else if(libertyDegrees == 2){
                    theoH0 = 
                } else if(libertyDegrees == 3){
                    theoH0 = 
                } else if (libertyDegrees == 4) {
                    theoH0 = 
                } else if (libertyDegrees == 5) {
                    theoH0 = 
                } else if (libertyDegrees == 6) {
                    theoH0 = 
                } else if (libertyDegrees == 7) {
                    theoH0 = 
                } else if (libertyDegrees == 8) {
                    theoH0 = 
                } else if (libertyDegrees == 9) {
                    theoH0 = 
                } else if (libertyDegrees == 10) {
                    theoH0 = 
                } else if (libertyDegrees == 11) {
                    theoH0 = 
                } else if (libertyDegrees == 12) {
                    theoH0 = 
                } else if (libertyDegrees == 13) {
                    theoH0 = 
                } else if (libertyDegrees == 14) {
                    theoH0 = 
                } else if (libertyDegrees == 15) {
                    theoH0 = 
                } else if (libertyDegrees == 16) {
                    theoH0 = 
                } else if (libertyDegrees == 17) {
                    theoH0 = 
                } else if (libertyDegrees == 18) {
                    theoH0 = 
                } else if (libertyDegrees == 19) {
                    theoH0 = 
                } else if (libertyDegrees == 20) {
                    theoH0 = 
                } else if (libertyDegrees == 21) {
                    theoH0 = 
                } else if (libertyDegrees == 22) {
                    theoH0 = 
                } else if (libertyDegrees == 23) {
                    theoH0 = 
                } else if (libertyDegrees == 24) {
                    theoH0 = 
                } else if (libertyDegrees == 25) {
                    theoH0 = 
                } else if (libertyDegrees == 26) {
                    theoH0 = 35.5632;
                } else if (libertyDegrees == 27) {
                    theoH0 = 
                } else if (libertyDegrees == 28) {
                    theoH0 = 
                } else if (libertyDegrees == 29) {
                    theoH0 = 
                }
                break;
            default:
                break;
        }
    }
}
