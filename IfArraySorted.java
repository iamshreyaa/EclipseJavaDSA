
public class IfArraySorted {

	public static void main(String[] args) {
		int max=0;
		int arr[]= {11,12,14,15,20};
		for(int i=1;i<arr.length;i++) {
			if (arr[i]>arr[max]) {
				max=max+1;
				continue;
			}
		}
		if (max==(arr.length-1)) {
			System.out.println("yes");
		}
		else {
			System.out.println("No");
		}

	}

}
