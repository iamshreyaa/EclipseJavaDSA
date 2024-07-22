package searching;

public class SearchInInfiniteSortedArray {
	static int searchinfinite(int arr[],int x) {
		if (arr[0]==x) {
			return 0;
		}
		int i=1;
		while(arr[i]<x) {
			i=i*2;
		}
		if (arr[i]==x) {
			return i;
		}
		else {
			return binarys(arr,x,(i/2)+1,i-1);
		}
	}
	static int binarys(int arr[],int x,int low,int high) {
		while (low<=high) {
			int midpoint=(low+high)/2;
			if (arr[midpoint]==x) {
				return midpoint;
			}
			if (arr[midpoint]>x) {
				high=midpoint-1;
			}
			if (arr[midpoint]<x) {
				low=midpoint+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,10,15,20,40,60,80,100,200,500,1000,1200,1500,2000};
		int x=100;
		System.out.println("index is "+searchinfinite(arr,x));
	}

}
