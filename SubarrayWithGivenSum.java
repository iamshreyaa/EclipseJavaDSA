package hashing;
import java.util.*;
public class SubarrayWithGivenSum {
	static boolean isSubarraySum(int []arr,int sum) {
		int presum=0;
		HashSet<Integer> h=new HashSet<>();
		for (int i=0;i<arr.length;i++) {
			presum=presum+arr[i];
			if (presum==sum) {
				return true;
			}
			if (h.contains(presum-sum)) {
				return true;
			}
			h.add(presum);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,2,8,10,-5,-8,6};
		System.out.println(isSubarraySum(arr,3));
	}

}
