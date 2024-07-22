package searching;

public class SortedRotatedArray {
	static int searchrotated(int arr[],int x) {
		int n=arr.length;
		int low=0;int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if (arr[mid]==x) {
				return mid;
			}
			if (arr[mid]>arr[low]) {
				if (x>=arr[low] && x<arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if (x<=arr[high] && x>arr[mid]) {
					low=mid+1;
				}
				else {
					high=mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,200,300,500,1000,10,20};
		int x=200;
		System.out.println("index is "+searchrotated(arr,x));

	}

}
