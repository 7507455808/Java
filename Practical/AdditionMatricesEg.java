package Pooja;

public class AdditionMatricesEg {

	public static void main(String[] args) {
		
		// creating two matrices
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][] = {{1,2,3},{6,7,8},{7,8,9}};
		
		// matrix to store sum of arr & arr1
		
		int result[][] = new int[3][3];
		
		//adding & printing addition of matrices
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				result[i][j] = arr[i][j] - arr1[i][j];
			//	result[i][j] = arr[i][j] + arr1[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
			
			
		}
		
		
		
		

	}

}
