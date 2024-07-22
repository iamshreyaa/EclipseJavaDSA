
public class FrequencyInSortedArray {
	static void frequency(int arr[]) {
		int count=1;
		int j=0;
		int n=arr.length;
		for (int i=1;i<n;i++){
			if (arr[i]==arr[j]) {
				count++;
				j++;
				continue;
			}
			System.out.println(arr[j]+" "+count);
			count=1;j++;
		}
		System.out.println(arr[j]+" "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {10,10,10,25,30};
		frequency(arr);

	}
}
