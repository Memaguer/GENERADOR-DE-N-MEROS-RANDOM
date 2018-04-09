/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

import java.util.Arrays;

/**
 *
 * @author AlisonGonzalez
 */
public class KolmogorovTest {
    public double empiricalAlpha, finalD;
    private double[] expected, dPositive, dNegative;
    private double[][] empiricalValues = new double[][]{
        {0.90000, 0.95000, 0.97500, 0.99000, 0.99500, 0.99750, 0.99900, 0.99950}, // n = 1
        {0.68337, 0.77639, 0.84189, 0.90000, 0.92929, 0.95000, 0.96838, 0.97764}, // n = 2
        {0.56481, 0.63604, 0.70760, 0.78456, 0.82900, 0.86428, 0.90000, 0.92065}, // n = 3
        {0.49265, 0.56522, 0.62394, 0.68887, 0.73424, 0.77639, 0.82217, 0.85047}, // n = 4
        {0.44698, 0.50945, 0.56328, 0.62718, 0.66853, 0.70543, 0.75000, 0.78137}, // n = 5
        {0.41037, 0.46799, 0.51926, 0.57741, 0.61661, 0.65287, 0.69571, 0.72479}, // n = 6
        {0.38148, 0.43607, 0.48342, 0.53844, 0.57581, 0.60975, 0.65071, 0.67930}, // n = 7
        {0.35831, 0.40962, 0.45427, 0.50654, 0.54179, 0.57429, 0.61368, 0.64098}, // n = 8
        {0.33910, 0.38746, 0.43001, 0.47960, 0.51332, 0.54443, 0.58210, 0.60846}, // n = 9
        {0.32260, 0.36866, 0.40925, 0.45562, 0.48893, 0.51872, 0.55500, 0.58042}, // n = 10
        {0.30892, 0.35242, 0.39122, 0.43670, 0.46770, 0.49539, 0.53135, 0.55588}, // n = 11
        {0.29577, 0.33815, 0.37543, 0.41918, 0.44905, 0.47672, 0.51047, 0.53422}, // n = 12 
        {0.28470, 0.32549, 0.36143, 0.40362, 0.43247, 0.45921, 0.49189, 0.51490}, // n = 13 
        {0.27481, 0.31417, 0.34890, 0.38970, 0.41762, 0.44352, 0.47520, 0.49753}, // n = 14
        {0.26589, 0.30397, 0.33750, 0.36613, 0.40420, 0.42943, 0.45611, 0.48182}, // n = 15 
        {0.25778, 0.29472, 0.32733, 0.36571, 0.39201, 0.41644, 0.44637, 0.46750}, // n = 16 
        {0.25039, 0.28627, 0.31796, 0.35528, 0.38086, 0.40464, 0.43380, 0.45540}, // n = 17 
        {0.24360, 0.27851, 0.30936, 0.34569, 0.37062, 0.39380, 0.42224, 0.44234}, // n = 18 
        {0.23735, 0.27136, 0.30143, 0.33685, 0.36117, 0.38379, 0.41156, 0.43119}, // n = 19
        {0.23156, 0.26473, 0.29408, 0.32866, 0.35241, 0.37451, 0.40165, 0.42085}, // n = 20
        {0.22517, 0.25858, 0.28724, 0.32104, 0.34426, 0.36588, 0.39243, 0.41122}, // n = 21 
        {0.22115, 0.25283, 0.28087, 0.31394, 0.33666, 0.35782, 0.38382, 0.40223}, // n = 22
        {0.21646, 0.24746, 0.27490, 0.30729, 0.32954, 0.35027, 0.37575, 0.39380}, // n = 23
        {0.21205, 0.24242, 0.26931, 0.30104, 0.32286, 0.34318, 0.36787, 0.38588}, // n = 24
        {0.20790, 0.23768, 0.26404, 0.29518, 0.31657, 0.33651, 0.36104, 0.37743}, // n = 25 
        {0.20399, 0.23320, 0.25908, 0.28962, 0.30963, 0.33022, 0.35431, 0.37139}, // n = 26
        {0.20030, 0.22898, 0.25438, 0.28438, 0.30502, 0.32425, 0.34794, 0.36473}, // n = 27
        {0.19680, 0.22497, 0.24993, 0.27942, 0.29971, 0.31862, 0.34190, 0.35842}, // n = 28
        {0.19348, 0.22117, 0.24571, 0.27471, 0.29466, 0.31327, 0.33617, 0.35242}, // n = 29
        {0.19032, 0.21756, 0.24170, 0.27023, 0.28986, 0.30818, 0.33072, 0.34672}, // n = 30
        {0.18732, 0.21412, 0.23788, 0.26596, 0.28529, 0.30333, 0.32553, 0.34129}, // n = 31
        {0.18445, 0.21085, 0.23424, 0.26189, 0.28094, 0.29870, 0.32058, 0.33611}, // n = 32
        {0.18171, 0.20771, 0.23076, 0.25801, 0.27577, 0.29428, 0.31584, 0.33115}, // n = 33
        {0.17909, 0.21472, 0.22743, 0.25429, 0.27271, 0.29005, 0.31131, 0.32641}, // n = 34
        {0.17659, 0.20185, 0.22425, 0.25073, 0.26897, 0.28600, 0.30597, 0.32187}  // n = 35
    };
    
    public KolmogorovTest(double[] _expected, double alpha){
        this.expected = _expected;
        this.dPositive = new double[expected.length];
        this.dNegative = new double[expected.length];
        this.finalD = calculateDValue();
        this.empiricalAlpha = getEmpiricalValue(alpha, _expected.length);
    }
    
    public double getEmpiricalValue(double alpha, int n){
        if(alpha == 0.20){
            if(n > 35){
                return 1.07/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][0];
            }
        }else if(alpha == 0.10){
            if(n > 35){
                return 1.22/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][1];
            }
        }else if(alpha == 0.05){
            if(n > 35){
                return 1.36/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][2];
            }
        }else if(alpha == 0.02){
            if(n > 35){
                return 1.52/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][3];
            }
        }else if(alpha == 0.01){
            if(n > 35){
                return 1.63/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][4];
            }
        }else if(alpha == 0.005){
            if(n > 35){
                return 1.73/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][5];
            }
        }else if(alpha == 0.002){
            if(n > 35){
                return 1.85/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][6];
            }
        }else if(alpha == 0.001){
            if(n > 35){
                return 1.95/Math.sqrt(n);
            }else{
                return empiricalValues[n - 1][7];
            }
        }else{
            return 0;
        }
    }
    
    public double calculateDValue(){
        double maxDNegative = 0;
        double maxDPositive = 0;
        for(int i = 0; i < expected.length; i++){
            double s = (double)(i+1)/expected.length;
            dPositive[i] = Math.abs(s - expected[i]);
            if(dPositive[i] > maxDPositive){
                maxDPositive = dPositive[i];
            }
            s = (double)(i)/expected.length;
            dNegative[i] = Math.abs(expected[i] - s);
            if(dNegative[i] > maxDNegative){
                maxDNegative = dNegative[i];
            }
        }
        if(maxDNegative > maxDPositive){
            return maxDNegative;
        }else{
            return maxDPositive;
        }
    }
}
