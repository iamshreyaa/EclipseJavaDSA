
public class PrefixSumTechnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,8,3,9,6,5,4};
		int n=arr.length;
		int psum[]=new int[n];
		psum[0]=arr[0];
		for (int i=1;i<n;i++) {
			psum[i]=psum[i-1]+arr[i];
		}
		System.out.println(getsum(2,6,psum));
		

	}
	static int getsum(int start,int end,int []psum) {
		if (start==0) {
			return psum[end];
		}
		else {
			return psum[end]-psum[start-1];
		}
	}

}
