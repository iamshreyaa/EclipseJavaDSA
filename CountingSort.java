package sorting;

public class CountingSort {
	static void csort(int arr[],int k,int n) {
		int count[]=new int[k];
		for (int i = 0;i < k ; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		
		for (int i=1;i<k;i++) {
			count[i]=count[i-1]+count[i];
		}
		
		int output[]=new int[n];
		
		for (int i = n-1; i >= 0; i--) {
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		for(int i=0; i<n; i++) {
			arr[i]=output[i];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,4,1,0,1};
		int k=5;
		int n=arr.length;
		
		csort(arr,k,n);
		
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
