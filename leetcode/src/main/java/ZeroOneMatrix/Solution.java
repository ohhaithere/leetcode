package ZeroOneMatrix;

public class Solution {

    public int[][] updateMatrix(int[][] mat) {
        boolean[][] visitedLeftAndUp = new boolean[mat.length][mat[0].length];
        boolean[][] visitedRightAndDown = new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++){
                dfsLeftAndUp(mat, visitedLeftAndUp, i, j);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++){
                dfsRightAndDown(mat, visitedRightAndDown, i, j);
            }
        }
        return mat;
    }

    private int dfsLeftAndUp(int[][] mat, boolean[][] visited, int x, int y) {
        if (visited[x][y]) {
            return mat[x][y];
        }
        if (mat[x][y] == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE - 1;
        if (x > 0) {
            min = Math.min(min, dfsLeftAndUp(mat, visited,x - 1, y));
        }
        if (y > 0) {
            min = Math.min(min, dfsLeftAndUp(mat, visited, x, y - 1));
        }
        mat[x][y] = min + 1;
        visited[x][y] = true;
        return mat[x][y];
    }

    private int dfsRightAndDown(int[][] mat, boolean[][] visited, int x, int y) {
        if (visited[x][y]) {
            return mat[x][y];
        }
        if (mat[x][y] == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE - 1;
        if (x < mat.length - 1) {
            min = Math.min(min, dfsRightAndDown(mat, visited,x + 1, y));
        }
        if (y < mat[x].length - 1) {
            min = Math.min(min, dfsRightAndDown(mat, visited, x, y + 1));
        }
        mat[x][y] = Math.min(mat[x][y], min + 1);
        visited[x][y] = true;
        return mat[x][y];
    }

}
