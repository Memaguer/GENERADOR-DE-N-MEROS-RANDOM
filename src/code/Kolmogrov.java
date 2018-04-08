/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author Emiliano Cervantes
 */
public class Kolmogrov {
    private int quantData;
    private int[] data;
    private String[][] result, resultTemp;
    
    public Kolmogrov(int quantData, int[] data){
        this.quantData = quantData;
        this.data = data;
    }
    
    public void calculate() {
        int fase = 1;
        while (fase < quantData) {
            long prevX = currentX;
            long power = (long) Math.pow(prevX, 2);
            currentX = getCenterNumbers(power);
            if (isOnArray(currentX)) {
                flag = false;
            }
            pushResult(prevX, power, currentX);
        }
    }
}
