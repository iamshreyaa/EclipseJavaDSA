
public class LeftRotateArrayM3 {
	static void leftRotate(int arr[],int n,int d) {
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	static void reverse(int arr[],int low,int high) {
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5};
		int n=arr.length;
		int d=2;
		leftRotate(arr,n,d);
		for (int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
