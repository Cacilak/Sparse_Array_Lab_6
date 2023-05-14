// Matrix.java, lab6
// Ryan Kimberlin, Adam B, _, _ , _
// 05/09/23

public abstract class Matrix {
    protected int rows;
    protected int columns;
    protected double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new double[rows][columns];
    } //-- Set rows and columns
    
    public Matrix(double[][] data) {
        this.data = data;
        this.columns = data[0].length;
        this.rows = data.length;
    } //-- Set rows and columns
    // this program will take an array and store the data in a linked list without storing the zeros.

    public abstract double get(int row, int col);
    //{return this.data[row][col]; }
    
    public abstract void set(int row, int col, double value);
    //{ this.data[row][col] = value;  }


}

