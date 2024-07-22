
public class MaxDiffProblem {
	static int maxdiff(int arr[]) {
		int max=arr[1]-arr[0];int temp=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				temp=arr[j]-arr[i];
				if (temp>max){
					max=temp;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,3,10,6,4,8,1};
		System.out.println(maxdiff(arr));
	}

}
