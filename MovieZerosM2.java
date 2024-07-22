
public class MovieZerosM2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,4,0,2,0,1};
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
