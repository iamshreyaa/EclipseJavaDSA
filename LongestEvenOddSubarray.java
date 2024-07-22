
public class LongestEvenOddSubarray {
	static int longestEO(int []arr) {
		int count=1;int res=1;
		for (int i=1;i<arr.length;i++) {
			if ((arr[i-1]%2==0 && arr[i]%2!=0) || (arr[i-1]%2!=0 && arr[i]%2==0)){
				count++;
				res=Math.max(count, res);
			}
			else {
				count=1;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5, 10, 20, 6, 3, 8};
		System.out.println(longestEO(arr));
	}

}
