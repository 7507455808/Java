package Pooja;

public class SecondLargestArrayEg {
	
	static int calculateSecondLargest(int arr[], int length) {
		int temp;
		
		//sort ascending
	
		for(int i=0; i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

	}
		return arr[length-2]; //calculate 2 largest
	}

	public static void main(String[] args) {
		int arr[] = {1,7,4,8,2,3,9};
		System.out.println("Second Largest is : " + calculateSecondLargest(arr, 7));
		
		

	}

}
