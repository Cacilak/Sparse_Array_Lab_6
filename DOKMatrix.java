import java.util.HashMap;

public class DOKMatrix extends Matrix{
    
    protected HashMap<String, Double> data;
    

    public DOKMatrix(){
        super(0, 0);

        this.data = new HashMap<String, Double>();
    }

    public DOKMatrix(double[][] map){
        super(map.length, map[0].length);
        
        this.data = new HashMap<String, Double>();

        for(int i = 0; i < this.rows; i++){

            for(int n = 0; n < this.columns; n++){
                
                if(map[i][n] != 0.0){
                    this.data.put(new String(Integer.toString(i) + "," + Integer.toString(n)), map[i][n]);
                }

            }

        }

    }

    public HashMap<String, Double> getData(){
        return this.data;
    }

    @Override
    public double get(int row, int col){
        
        String list = new String(Integer.toString(row) + "," + Integer.toString(col));
        
        if(this.data.get(list) != null){

            return this.data.get(list);
        } else {
            return 0.0;
        }
    }

    @Override
    public void set(int row, int col, double value){
        
        String list = new String(Integer.toString(row) + "," + Integer.toString(col));

        if(this.data.get(list) == null){
            this.data.put(list, value);
        } else {
            this.data.remove(list);
            this.data.put(list, value);           
        }
    }
    
    public static void main(String[] args){

        double[][] maty = new double[][]{{0,1},{1,0},{2,0}};

        DOKMatrix test = new DOKMatrix(maty);

        test.set(1, 1, 5);

        System.out.println(test.get(1, 1));
        System.out.println(test.get(2, 0));


    }

}
