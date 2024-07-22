package sorting;


//not stable
public class HoarsePartition {
	static int partition1(int arr[],int l,int h) {
		int i=l-1;
		int j=h+1;
		int pivot=arr[l];
		
		while (true) {
			do {
				i++;
			} while (arr[i] < pivot);
			
			do {
				j--;
			} while (arr[j] > pivot);
			
			if (i >= j)
				return j;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,3,8,4,2,7,1,10};
		int n=arr.length;
		System.out.println("last smollest no. before pivot is at pos: " + partition1(arr,0,n-1));
	}

}
