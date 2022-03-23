package ReshapeTheMatrix;

public class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int result[][] = new int[r][c];
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }

        int matI = 0;
        int matJ = 0;

        for (int i = 0; i < r; i ++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[matI][matJ];
                matJ++;
                if (matJ == mat[0].length) {
                    matJ = 0;
                    matI++;
                }
            }
        }

        return result;
    }

}
