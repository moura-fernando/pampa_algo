public class StrassenMatrixMultiplication {
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int n = A.length;
        
        if (n == 1) {
            int[][] C = new int[1][1];
            C[0][0] = A[0][0] * B[0][0];
            return C;
        }
        
        int[][] C = new int[n][n];
        int halfSize = n / 2;
        
        // Divide as matrizes em quatro submatrizes menores
        int[][] A11 = new int[halfSize][halfSize];
        int[][] A12 = new int[halfSize][halfSize];
        int[][] A21 = new int[halfSize][halfSize];
        int[][] A22 = new int[halfSize][halfSize];
        int[][] B11 = new int[halfSize][halfSize];
        int[][] B12 = new int[halfSize][halfSize];
        int[][] B21 = new int[halfSize][halfSize];
        int[][] B22 = new int[halfSize][halfSize];
        
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < halfSize; j++) {
                A11[i][j] = A[i][j];
                A12[i][j] = A[i][j + halfSize];
                A21[i][j] = A[i + halfSize][j];
                A22[i][j] = A[i + halfSize][j + halfSize];
                B11[i][j] = B[i][j];
                B12[i][j] = B[i][j + halfSize];
                B21[i][j] = B[i + halfSize][j];
                B22[i][j] = B[i + halfSize][j + halfSize];
            }
        }
        
        // Calcula produtos intermediários
        int[][] M1 = multiplyMatrices(addMatrices(A11, A22), addMatrices(B11, B22));
        int[][] M2 = multiplyMatrices(addMatrices(A21, A22), B11);
        int[][] M3 = multiplyMatrices(A11, subtractMatrices(B12, B22));
        int[][] M4 = multiplyMatrices(A22, subtractMatrices(B21, B11));
        int[][] M5 = multiplyMatrices(addMatrices(A11, A12), B22);
        int[][] M6 = multiplyMatrices(subtractMatrices(A21, A11), addMatrices(B11, B12));
        int[][] M7 = multiplyMatrices(subtractMatrices(A12, A22), addMatrices(B21, B22));
        
        // Calcula as submatrizes resultantes
        int[][] C11 = subtractMatrices(addMatrices(addMatrices(M1, M4), M7), M5);
        int[][] C12 = addMatrices(M3, M5);
        int[][] C21 = addMatrices(M2, M4);
        int[][] C22 = subtractMatrices(subtractMatrices(addMatrices(M1, M3), M2), M6);
        
        // Combina as submatrizes resultantes em C
        for (int i = 0; i < halfSize; i++) {
            for (int j = 0; j < halfSize; j++) {
                C[i][j] = C11[i][j];
                C[i][j + halfSize] = C12[i][j];
                C[i + halfSize][j] = C21[i][j];
                C[i + halfSize][j + halfSize] = C22[i][j];
            }
        }
        
        return C;
    }
    
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }
    
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] - B[i][j];
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


