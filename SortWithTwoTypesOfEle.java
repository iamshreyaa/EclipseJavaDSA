package sorting;

public class SortWithTwoTypesOfEle {
	//hoare's partition used

	static void segPosNeg(int arr[],int n) {
		int i=-1;
		int j=n;
		while (true) {
			do {
				i++;
			}while(arr[i]<0);
			
			do {
				j--;
			}while(arr[i]>=0);
			
			if (i>=0) {
				return;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-12,3,4,-9,2};
		int n=arr.length;
		segPosNeg(arr,n);
		for (int k=0;k<n;k++) {
			System.out.println(arr[k]);
		}
	}

}
