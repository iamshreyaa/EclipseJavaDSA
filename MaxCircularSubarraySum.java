
public class MaxCircularSubarraySum {
	static int maxcircular(int arr[],int n) {
		int res=arr[0];
		for (int i=0;i<n;i++) {
			int cursum=arr[i];
			int curmax=arr[i];
			for (int j=1;j<n;j++) {
				int index=(i+j)%n;
				cursum=cursum+arr[index];
				curmax=Math.max(curmax, cursum);
			}
			res=Math.max(res, curmax);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,-2,3,4};
		int n=arr.length;
		System.out.println(maxcircular(arr,n));

	}

}
