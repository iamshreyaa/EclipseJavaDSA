package sorting;

public class SortWithThreeTypesOfEle {
	static void sort(int arr[],int n) {
		int lo=0; int mid=0; int hi=n-1;
		while (mid<=hi) {
			if (arr[mid]==0) {
				//swap(arr[lo],arr[mid])
				int temp=arr[lo];
				arr[lo]=arr[mid];
				arr[mid]=temp;
				lo++;
				mid++;
			}
			else if (arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[hi];
				arr[hi]=temp;
				hi--;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,2,0,1,2};
		int n=arr.length;
		sort(arr,n);
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
