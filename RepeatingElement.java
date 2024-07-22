package searching;

public class RepeatingElement {
	static int repeatingele(int arr[],int n) {
		boolean visited[]= {false,false,false,false,false,false};
		for (int i=0;i<n;i++) {
			if (visited[arr[i]]) {
				return arr[i];
			}
			visited[arr[i]]=true;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,2,1,3,2,2};
		int n=arr.length;
		System.out.println(repeatingele(arr,n));

	}

}
