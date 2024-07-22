
public class SecondLargestArray {

	public static void main(String[] args) {
		int arr[]= {0,6,9,23,1};
		int max=0;
		for (int i=1;i<arr.length;i++) {
			if (arr[i]>arr[max]) {
				max=i;
			}
			
		}
		int flag=-1;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]!=arr[max]) {
				if (flag==-1) {
					flag=i;
				}
				if(arr[i]>arr[flag]) {
					flag=i;
				}
			}
			
		}
		System.out.println("2nd largest no. is at : "+ flag +" index");

	}

}
