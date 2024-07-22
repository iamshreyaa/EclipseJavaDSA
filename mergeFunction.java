package sorting;

public class mergeFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={10,15,20,40,8,11,55};
		int low=0;int mid=2;int high=6;
		int n=arr.length;
		
		
		int n1=mid-low+1;
		int n2=high-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for (int i=0;i<n1;i++) {
			left[i]=arr[low+i];
		}
		for (int j=0;j<n2;j++) {
			right[j]=arr[mid+j+1];
		}
		int i=0;int j=0;int k=low;
		while (i<n1 && j<n2) {
			if (left[i]<=right[j]) {
				arr[k]=left[i];
				i++;
				k++;
			}
			else {
				arr[k]=right[j];
				j++;
				k++;
			}
		}
		while (i<n1) {
			arr[k]=left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=right[j];
			j++;
			k++;
		}
		
		for (int p=0;p<n;p++) {
			System.out.println(arr[i]);
		}
	}

}
