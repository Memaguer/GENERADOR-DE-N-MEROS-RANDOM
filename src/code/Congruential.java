package code;
//import org.apache.commons.math3.stat.inference.*;
//import org.apache.commons.math3.distribution.*;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Congruential {
    private long x, a, c, m;
    private String[][] result, resultTemp;

    public Congruential(long x, long a, long c, long m) {
        this.x = x;
        this.a = a;
        this.c = c;
        this.m = m;
        this.result = new String[0][5];
    }

    public Congruential(long x, long a, long m) {
        this.x = x;
        this.a = a;
        this.c = 0;
        this.m = m;
        this.result = new String[0][5];
    }

    public void calculate() {
        boolean flag = true;
        pushResult(0, x);
        while (flag) {
            long prevX = x;
            if (m > 0) {
                x = (a * prevX + c) % m;
            } else {
                JFrame frame = new JFrame("Alerta");
                JOptionPane.showMessageDialog(frame, "m no puede ser 0");
            }
            if (isOnArray(x)) {
                flag = false;
            }
            pushResult(prevX, x);
        }
    }

    private void pushResult(long prevX, long x) {
        resultTemp = result;
        int size = resultTemp.length;
        result = new String[size + 1][5];

        for (int i = 0; i < size; i++) {
            System.arraycopy(resultTemp[i], 0, result[i], 0, 5);
        }

        if (resultTemp.length != 0) {
            result[size][0] = size + "";
            if (c == 0) {
                result[size][1] = "( " + a + " * " + prevX + " ) mod " + m;
                result[size][2] = a * prevX / m + " + " + a * prevX % m + "/" + m;
            } else {
                result[size][1] = "( " + a + " * " + prevX + " + " + c + " ) mod " + m;
                result[size][2] = (a * prevX + c) % m + " + " + (a * prevX + c) % m + "/" + m;
            }
            result[size][3] = x + "";
            result[size][4] = (double) x / m + "";
        } else {
            result[size][0] = size + "";
            result[size][1] = "";
            result[size][2] = "";
            result[size][3] = x + "";
            result[size][4] = "";
        }
    }

    public String hullDobell() {
        String message = "No es periodo completo.";
        
        if (getGCD(c, m) == 1) {
            long q = a - 1;
            if (a % q == 1 % q) {
                if (a % 4 == 1 % 4) {
                    message = "Es periodo completo.";
                }
            }
        }
        return message;
    }

    public long getGCD(long a0, long b0) {
        if (b0 == 0) {
            return a0;
        }
        return getGCD(b0, a0 % b0);
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
    }
    
    public double[] getColumn(String[][] array, int index){
        double[] column = new double[array.length-1];
        for(int i = 0; i < column.length; i++){
           column[i] = Double.valueOf(array[i+1][index]);
        }
        return column;
    }
    
    public String kolmoTest(double alpha){
        double[] data = getColumn(result, 4);
        //double[] data = {0.02, 0.0356, 0.1355, 0.5011, 1.514, 1.6055, 2.3710, 3.2225, 8.8836, 19.0123};
        Arrays.sort(data);
        double mean = 0;
        for (double i : data){
            mean += i;
        }
        mean = mean / data.length;
        //ExponentialDistribution exp = new ExponentialDistribution(mean);
        ExponentialFunction ex = new ExponentialFunction(data);
        ex.setData();
        KolmogorovTest km = new KolmogorovTest(ex.getData(), alpha);
        double empiricalD = km.empiricalAlpha;
        double finalD = km.finalD;
        
        if(finalD < empiricalD){
            return "Alfa = "+alpha+"\nD calculado = "+finalD+"\nD empírico = "+empiricalD+"\nLa hipótesis nula no se rechaza";
        }else{
            return "D calculado = "+finalD+"\nD empírico = "+empiricalD+"\nLa hipótesis nula se rechaza";
        }
    }
    
}