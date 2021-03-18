public class MatrixAdd{
    public static void main(String[] args){
        int i,j,rows=2,columns=2;
        int[][] firstmat = {{12,3},{5,9}};
        int[][] secondmat = {{2,9},{6,4}};
        int[][] sum = new int[2][2];
        for(i=0;i<rows;++i){
            for(j=0;j<columns;++j){
                    sum[i][j] = firstmat[i][j] + secondmat[i][j];
            }    
        }
        System.out.println("Addition of the two matrices is");
        for(i=0;i<rows;++i){
            for(j=0;j<columns;++j){
                System.out.print(sum[i][j] + " ");       
            }
            System.out.println();
        }
    }
} 