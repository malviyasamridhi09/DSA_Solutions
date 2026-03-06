
public class MatrixIdentity {
    public static void main(String[] args){

        int[][] A = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        int[][] B = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};

        boolean same = true;

        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j] != B[i][j]){
                    same = false;
                    break;
                }
            }
        }

        if(same)
            System.out.println("Matrices are identical");
        else
            System.out.println("Matrices are not identical");
    }
}