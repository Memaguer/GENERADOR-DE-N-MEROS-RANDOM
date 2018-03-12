package code;

public class QuadraticCenter {

    private long seed;
    private String[][] result, resultTemp;

    public QuadraticCenter(long seed) {
        this.seed = seed;
        this.result = new String[0][5];
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

    public void calculate() {
        boolean flag = true;
        pushResult(0, 0, seed);
        long currentX = seed;
        while (flag) {
            long prevX = currentX;
            long power = (long) Math.pow(prevX, 2);
            currentX = getCenterNumbers(power);
            if (isOnArray(currentX)) {
                flag = false;
            }
            pushResult(prevX, power, currentX);
        }
    }

    private int getCenterNumbers(long result) {
        String resultString = result + "";
        while (resultString.length() < 6) {
            resultString = "0" + resultString;
        }
        String reverse = new StringBuffer(resultString).reverse().toString();
        resultString = reverse.substring(2, 6);
        resultString = new StringBuffer(resultString).reverse().toString();
        return Integer.parseInt(resultString);
    }

    private void pushResult(long prevX, long power, long currentX) {
        resultTemp = result;
        int size = resultTemp.length;
        result = new String[size + 1][5];

        for (int i = 0; i < size; i++) {
            System.arraycopy(resultTemp[i], 0, result[i], 0, 5);
        }

        if (resultTemp.length != 0) {
            result[size][0] = size + "";
            result[size][1] = prevX + " ^ 2";
            result[size][2] = power + "";
            result[size][3] = currentX + "";
            result[size][4] = (double) currentX / 10000 + "";
        } else {
            result[size][0] = size + "";
            result[size][1] = "";
            result[size][2] = "";
            result[size][3] = currentX + "";
            result[size][4] = "";
        }
    }

    public String[][] getArray() {
        return this.result;
    }

    private void printArray() {
        for (String[] array : result) {
            for (String element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
