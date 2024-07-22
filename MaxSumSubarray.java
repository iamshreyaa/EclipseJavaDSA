
public class MaxSumSubarray {
	static int maxsum(int []arr) {
		int result=arr[0];
		int maxending=arr[0];
		for (int i=1;i<arr.length;i++) {
			maxending=Math.max(maxending+arr[i],arr[i]);
			result=Math.max(maxending, result);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-5,1,-2,3,-1,2,-1};
		System.out.println(maxsum(arr));
	}

}
