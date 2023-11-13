
public class MatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int x = A.length;
        int y = A[0].length;
        int z = B[0].length;
        int[][] result = new int[x][z];
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < z; j++) {
                for (int k = 0; k < y; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
    	int[][] A = {{1, 2}, {3, 4}};
        int[][] B = {{5, 6}, {7, 8}};
        
        int[][] result = multiplyMatrices(A, B);
        
        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

