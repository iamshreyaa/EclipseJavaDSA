
public class ReverseArray {

	public static void main(String[] args) {
		int []arr= {10,3,23,1};
		int low=0,high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		System.out.println("Reverse array is : ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
