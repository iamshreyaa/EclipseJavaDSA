
public class MaxAppearingArray {
	public static int maxappear(int left[],int right[],int n) {
		int freq[]=new int[100];
		for (int i=0;i<100;i++) {
			freq[i]=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=left[i];j<=right[i];j++) {
				freq[j]=freq[j]+1;
			}
		}
		int res=0;
		for (int i=1;i<100;i++) {
			if (freq[i]>freq[res]) {
				res=i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []left= {1,2,5,15};
		int []right= {5,8,7,18};
		int n=left.length;
		System.out.println(maxappear(left,right,n));
	}

}
