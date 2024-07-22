
public class SortedduplicatesPart2 {
	static int duplicates2(int []arr,int n) {
		int count=1;
		int occurences=1;
		for (int i=1;i<n;i++) {
			if (arr[i]==arr[i-1]) {
				occurences++;
			}
			else {
				occurences=1;
			}
			if (occurences<=2) {
				arr[count]=arr[i];
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,2,2,3,3,3,4,4,4};
		int k=duplicates2(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
