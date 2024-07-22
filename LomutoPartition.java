package sorting;

public class LomutoPartition {
	static int partition3(int arr[],int l,int h) {
		int pivot = arr[h];
		int i = l - 1;
		
		for (int j = l; j < h; j++) {
			if (arr[j]<pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		
		return i+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {30,20,70,80,50,60};
		int n=arr.length;
		System.out.println("position of pivot is now(0-indexed) : "+ partition3(arr,0,n-1));
		
		//here we are assuming that pivot is the last element
		//even if pivot is given some middle element then we can just swap the pivot element with last element
		//then continue with same steps
	}

}
