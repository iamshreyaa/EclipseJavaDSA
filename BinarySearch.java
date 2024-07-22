package searching;

public class BinarySearch {
	static int binarys(int arr[],int x) {
		int n=arr.length;
		int low=0;int high=n-1;
		while (low<=high) {
			int midpoint=(low+high)/2;
			if (arr[midpoint]==x) {
				return midpoint;
			}
			if (arr[midpoint]>x) {
				high=midpoint-1;
			}
			if (arr[midpoint]<x) {
				low=midpoint+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,40};
		int x=20;
		System.out.println(binarys(arr,x));
	}

}
