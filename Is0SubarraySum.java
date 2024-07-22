package hashing;
import java.util.*;

public class Is0SubarraySum {
	static boolean isSubarray(int []arr) {
		int presum=0;
		HashSet<Integer> h=new HashSet<>();
		for (int i=0;i<arr.length;i++) {
			if (h.contains(presum)) {
				return true;
			}
			if (presum==0) {
				return true;
			}
			h.add(presum);
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {-3,4,-3,-1,1};
		System.out.println(isSubarray(arr));
	}

}
