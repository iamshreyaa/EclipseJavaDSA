
public class EquilibriumPoint {
	static boolean equipoint(int []arr,int n) {
		int rsum=0;
		for (int i=0;i<n;i++) {
			rsum=rsum+arr[i];
		}
		int lsum=0;
		for (int i=0;i<n;i++) {
			rsum=rsum-arr[i];
			if (rsum==lsum) {
				return true;
			}
			lsum=lsum+arr[i];
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,2,2};
		int n=arr.length;
		System.out.println(equipoint(arr,n));
	}

}
