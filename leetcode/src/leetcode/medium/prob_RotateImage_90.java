package leetcode.medium;

import java.util.Arrays;

public class prob_RotateImage_90 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        transpose(arr);
        reverseRows(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }

    public static void transpose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int[][] result = new int[col][row];  // Create a new matrix to store the transposed values

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = arr[i][j];
            }
        }

        // Copy the transposed values back to the original matrix
        for (int i = 0; i < row; i++) {
            for(int j=0;j<col;j++){
                arr[i][j]=result[i][j];
            }
        }
    }

    public static void reverseRows(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row; i++) {
            int start = 0;
            int end = col - 1;
            while (start < end) {
                // Swap elements at start and end positions in the row
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }
    }

}
