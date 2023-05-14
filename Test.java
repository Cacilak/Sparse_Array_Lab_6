public class Test{
    public static void main(String[] args){ // test made by Adam B
        double[][] data = {{1,0,2,0,3},{0,0,0,0,1},{0,0,0,0,0},{4,0,0,4,4},{0,0,5,6,7}};
        Matrix n1 = new Matrix(10,10); // edit me
        n1.set(3,3,50);
        n1.set(9,2,49);
        n1.set(9,1,48);
        n1.set(9,3,49);
        n1.set(0,0,1);
        n1.set(9,1,44);
        Matrix n2 = new Matrix(data); // edit me 
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
