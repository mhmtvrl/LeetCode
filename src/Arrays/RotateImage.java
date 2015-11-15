package Arrays;

/**
 * Problem # 48
 * 
 * Rotate Image
 * 
 * You are given an n x n 2D matrix representing an image
 * 
 * Rotate the iage by 90 degrees (clockwise)
 * 
 * Follow up:
 * 
 * Could you do in-place?
 * 
 * @author mehmet
 *
 */

public class RotateImage {
	
	/**
	 * clockwise : transpose, reverseColumns
	 * counter clockwise: reverseColums, transpose
	 * 
	 * TODO: make it fast
	 * @param matrix
	 */
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;
        
        transposeMatrix(matrix);
        reverseColumns(matrix);
    }
    
    public void transposeMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    public void reverseColumns(int[][] matrix){
        for(int i = 0; i < matrix.length; i++)
            reverseArray(matrix[i]);
    }
    
    public void reverseArray(int[] arr){
        for(int i = 0; i < arr.length / 2; i++){
            int last = arr.length - 1 - i;
            int temp = arr[last];
            arr[last] = arr[i];
            arr[i] = temp;
        }
    }
}
