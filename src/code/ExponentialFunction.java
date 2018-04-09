/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author AlisonGonzalez
 */
public class ExponentialFunction {
    private int n;
    private double x, lamda;
    private double[] values, finalData;
    
    public ExponentialFunction(double[] values){
        n = values.length;
        x = 0;
        for (double i : values){
            x += i;
        }
        x = x/n;
        this.lamda = 1/x;
        this.values = values;
        this.finalData = new double[n];
    }
    
    public void setData(){
        for(int i = 0; i < finalData.length; i++ ){
            finalData[i] = 1 - Math.pow(Math.E, -lamda * values[i]);
        }
    }
    
    public double[] getData(){
        return finalData;
    }
    
}
