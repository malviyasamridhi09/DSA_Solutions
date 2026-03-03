import java.util.*;

public class MatrixRotation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        // Input matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 1: Transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }

        // Proper Output Format
        System.out.print("Matrix:[");
        for(int i = 0; i < n; i++){
            System.out.print(Arrays.toString(arr[i]));
            if(i != n - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}