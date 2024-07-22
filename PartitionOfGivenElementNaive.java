package sorting;

public class PartitionOfGivenElementNaive {
	
	static void partition(int arr[],int l,int p,int h) {
		int temp[]=new int[h-l+1];
		int index=0;
		for(int i=l;i<=h;i++) {
			if (arr[i]<=arr[p]) {
				temp[index]=arr[i];
				index++;
			}
		}
		for(int i=l;i<=h;i++) {
			if (arr[i]>arr[p]) {
				temp[index]=arr[i];
				index++;
			}
		}
		for (int i=l;i<=h;i++) {
			arr[i]=temp[i-l];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,13,6,9,12,11,8};
		int n=arr.length;
		partition(arr,0,n-1,n-1);
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
