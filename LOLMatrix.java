// LOLMatrix.java
// Ryan Kimberlin
// 05/09/23

import java.util.LinkedList;

public class LOLMatrix extends Matrix {
    //LinkedList row = new LinkedList();
    //LinkedList col = new LinkedList();

    int row;
    int col;


    // Constructor
    public LOLMatrix(int row, int col) {
        super(row, col);
    }

    public LOLMatrix(double data[][]) {
        super(data);
    }


    // Getters and Setters
    public double get(int row, int col) {
        return LOLMatrix(row, col);
    }

    public void set(int row, int col, int val) {

    }
    

   /* public static void main(String[] args) {
        double data[][] = new double[3][4];
        data[0][1] = 1;
        data[1][0] = 2;
        data[2][3] = 3;

        LOLMatrix test = new LOLMatrix(data);

        
    } */

    public static void main(String[] args){ // test made by Adam B
        double[][] data = {{1,0,2,0,3},{0,0,0,0,1},{0,0,0,0,0},{4,0,0,4,4},{0,0,5,6,7}};
        LOLMatrix n1 = new LOLMatrix(10,10);
        n1.set(3,3,50);
        n1.set(9,2,49);
        n1.set(9,1,48);
        n1.set(9,3,49);
        n1.set(0,0,1);
        n1.set(9,1,44);
        LOLMatrix n2 = new LOLMatrix(data);
        n2.set(0,1,1);
        n2.set(1,4,2);
        System.out.println(n2.get(0,0) == 1);
        System.out.println(n2.get(3,2) == 0);
        System.out.println(n2.get(3,4) == 4);
        System.out.println(n2.get(4,4) == 7);
        System.out.println(n2.get(1,4) == 2);
        System.out.println(n1.get(3,3) == 50);
        System.out.println(n1.get(3,4) == 0);
        System.out.println(n2.get(0,1) == 1);
        System.out.println(n1.get(9,2) == 49);
        System.out.println(n1.get(9,3) == 49);
        System.out.println(n1.get(9,1) == 44);

        // this should crash or get false
        System.out.println(n1.get(9,0) == 47);
        System.out.println(n2.get(5,1) == 1);
    }
}