package lab7;

public class Matrix {
	public  final int n = 10;
	
	public void getSaddlePoint(int[][] matrix){
		final int n = matrix.length;
		int i,j, value;
		int[] min_h = new int[n];
		int[] max_w = new int[n];
		
		for (i = 0;  i < n; i++) {
			value = matrix[i][0];
			for (j = 0; j < n; j++) {
				if (matrix[i][j] < value) {
					value = matrix[i][j];
				}
			}
			min_h[i] = value;
		}
		
		for (j = 0; j < n; j++) {
			value = matrix[0][j];
			for (i = 0; i < n; i++) {
				if (matrix[i][j] > value) {
					value = matrix[i][j];
				}
			}
			max_w[j] = value;
		}
		
		for (i = 0; i < n; i++) {
			 for (j = 0; j < n; j++) {
				 if (matrix[i][j] == max_w[j] && matrix[i][j] == min_h[i]) {
					System.out.println("Index[" + i + "]" + "[" + j + "]" + " : " + "(" + matrix[i][j] + ")");
				}
			 }
		}
		
	}
}
