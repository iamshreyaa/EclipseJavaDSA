package sorting;

import java.util.Arrays;

public class maxGuest {
	static int maxmeet(int arr[],int dep[],int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1;int j=0;int count=1;int res=1;
		 while (i<n && j<n) {
			 if (arr[i]<=dep[j]) {
				 count++;
				 i++;
			 }
			 else {
				 count--;
				 j++;
			 }
			 res=Math.max(count, res);
		 }
		 System.out.println(res);
		 return res;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {900,600,700};
		int dep[]= {1000,800,730};
		int n=arr.length;
		maxmeet(arr,dep,n);
		
	}

}
