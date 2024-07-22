
public class LeaderInArray {
	static void leader(int arr[],int n) {
		int currldr=arr[n-1];
		System.out.println(currldr);
		for (int i=n-2;i>=0;i--) {
			if (currldr<arr[i]) {
				currldr=arr[i];
				System.out.println(currldr);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,4,10,6,5,2};
		int n=arr.length;
		leader(arr,n);
	}

}
