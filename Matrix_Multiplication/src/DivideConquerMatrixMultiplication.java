
public class DivideConquerMatrixMultiplication {
	
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int m = A.length;
        int n = A[0].length;
        int p = B[0].length;
        
        if (n != B.length) {
            throw new IllegalArgumentException("Número de colunas de A deve ser igual ao número de linhas de B");
        }
        
        int[][] C = new int[m][p];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        return C;
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




