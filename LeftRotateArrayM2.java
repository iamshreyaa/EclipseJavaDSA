
public class LeftRotateArrayM2 {

	public static void main(String[] args) {
		int []arr= {1,2,3,4,5};
		int d=2;
		int n=arr.length;
		int []temp=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for (int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
