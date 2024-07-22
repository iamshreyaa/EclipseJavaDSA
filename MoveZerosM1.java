
public class MoveZerosM1 {

	public static void main(String[] args) {
		int []arr= {10,5,0,1,0,6};
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]!=0) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
