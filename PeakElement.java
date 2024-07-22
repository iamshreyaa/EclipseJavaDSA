package searching;

public class PeakElement {
	static int peakele(int arr[],int n) {
		int low=0;int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if ((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1])){
				return mid;
			}
			if (mid>0 && arr[mid-1]>=arr[mid]) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,10,20,60,12};
		int n=arr.length;
		System.out.println("index is "+peakele(arr,n));
	}

}
