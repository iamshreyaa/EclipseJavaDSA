
public class MaxConsecutive1s {
	static int max1s(int arr[]) {
		int res=0;int count=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==1) {
				count++;
				res=Math.max(count, res);
				
			}
			else {
				
				count=0;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,0,1,1,1,1,0,1,1,1,1,1,1};
		System.out.println(max1s(arr));
	}

}
