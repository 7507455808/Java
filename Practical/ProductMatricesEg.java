package Pooja;

public class ProductMatricesEg {
	
	public static void main(String[] args) {
		//creating two matrices
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int r=arr.length;
		int c=arr[0].length; //calculate number of rows & cols in arr
		
		int r1=arr1.length;
		int c1=arr1[0].length; //calculate number of rows & cols in arr1
		
		if(c!=r1) {
			System.out.println("Multiplication not possible");
			
		}
		else {
			int res[][] = new int[r][c]; //hold result
			
			//product of matrices arr & arr1 store in res
			for(int i=0;i<r;i++) {
				for(int j=0;j<c1;j++) {
					for(int k=0;k<r1;k++) {
						res[i][j] = res[i][j] + arr[i][k] * arr1[k][j];
						
					}
				}
			}
			System.out.println("Product of two matrices");
			for(int i=0;i<r;i++) {
				for(int j=0;j<c1;j++) {
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
				
			}
		}

	}

}
