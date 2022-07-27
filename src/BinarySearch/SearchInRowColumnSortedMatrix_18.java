package BinarySearch;

/**
 * Given an n x n matrix and a number x, find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”. In the given matrix, every row and column is sorted in increasing order. The designed algorithm should have linear time complexity.
 * Example :
 * <p>
 * Input : mat[4][4] = { {10, 20, 30, 40},
 * {15, 25, 35, 45},
 * {27, 29, 37, 48},
 * {32, 33, 39, 50}};
 * x = 29
 * Output : Found at (2, 1)
 */
public class SearchInRowColumnSortedMatrix_18 {
    private static int[] findInRowColSortedMatrix(int[][] mat, int target, int n, int m) {
        int i = 0;
        int j = m - 1;
        int[] res = {-1, -1};

        while (i >= 0 && i < m && j >= 0 && j < m) {
            if (mat[i][j] == target) {
                res[0] = i;
                res[1] = j;
                return res;
            } else if (target > mat[i][j]) {
                i++;
            } else if (target < mat[i][j]) {
                j--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 37;
        int n = mat.length;
        int m = mat[0].length;
        int[] res = findInRowColSortedMatrix(mat, target, n, m);
        if (res[0] == -1 || res[1] == -1) {
            System.out.println("Element is not present in the matrix");
        } else {
            System.out.println("Element found at row " + res[0] + " Column " + res[1]);
        }

    }
}
