
public class MaxDiffProblem2 {
	static int maxdiff2(int []arr) {
		int res=arr[1]-arr[0];
		int minval=arr[0];
		for (int j=1;j<arr.length;j++) {
			res=Math.max(res,arr[j]-minval);
			minval=Math.min(minval, arr[j]);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,10,6,4,8,1};
		System.out.println(maxdiff2(arr));
	}

}
