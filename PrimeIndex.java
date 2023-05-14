import java.util.HashMap;
import java.lang.Math;
public class PrimeIndex extends Matrix{  // made by Adam B

    int row;
    int column;
    HashMap<Integer,Double> PrimeMatrix;

    private static int findNthPrimeNumber(int n) {
        if(n==1)
        {
            return 2;
        }

        int i=1;
        int count=1;
        //While loop should run until we find nth prime number i.e (count != n)
        while(count != n){
            // increment number by 2 as even numbers are always not prime
            i+=2;

            if(isPrime(i))
                count++;  // increment the count when we get prime number
        }
        // return nth prime number
        return i;
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    /*
    this code is not mine i got it from https://java2blog.com/nth-prime-number-java/
    I am using it for the pouroses of this asignment to get prime numbers for my code
    */
    public PrimeIndex(int rows, int columns) {
        super(rows, columns);
        row = rows;
        column = columns;
        PrimeMatrix = new HashMap<Integer,Double>();
    }
    public PrimeIndex(double[][] data) {
        super(data);
        row = data.length;
        column = data[1].length;
        PrimeMatrix = new HashMap<Integer,Double>();
        for (int y = 0; y < row; y++){
            int yprime = 1;
            if (y>0){
                yprime = findNthPrimeNumber(y);
            }
            for (int x = 0; x < row; x++){
                int xprime = 1;
                if (x>0){
                    xprime = findNthPrimeNumber(x);
                }
                if (data[y][x] != 0){
                    PrimeMatrix.put((int)Math.pow(yprime,2)*xprime,data[y][x]);
                }
            }

        }

    }
    /*
    stores each double at an index of (findNthPrimeNumber(y) ^ 2)(findNthPrimeNumber(x))
    so each is a combo of one prime and one prime squared alowing for no overlap of index numbers.
    there are gaps(index values that wont be used) but it is still very compact.
     */

    public double get(int row, int col) {
        int y = 1;
        int x = 1;
        if (row>0){
            y = findNthPrimeNumber(row);
        }
        if (col>0){
            x = findNthPrimeNumber(col);
        }
        if (PrimeMatrix.containsKey((int)Math.pow(y,2)*x)){
            return(PrimeMatrix.get((int)Math.pow(y,2)*x));
        }
        return 0;

    }


    public void set(int therow, int thecol, double value) {
        if (therow<row && thecol<column) {
            int y = 1;
            int x = 1;
            if (therow > 0) {
                y = findNthPrimeNumber(therow);
            }
            if (thecol > 0) {
                x = findNthPrimeNumber(thecol);
            }
            PrimeMatrix.put((int)Math.pow(y,2) * x, value);
        }
    }
}