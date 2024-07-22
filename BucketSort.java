package sorting;

import java.util.*;
public class BucketSort {
	static void bsort(int arr[],int k) {
		int n = arr.length;
		int maxele = arr[0];
		for (int i = 0; i < n; i++) {
			maxele=Math.max(maxele, arr[i]);
		}
		maxele++;
		
		ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
		
		for (int i=0;i<k;i++) {
			bkt.add(new ArrayList<Integer>());
		}
		
		for (int i=0 ; i<n;i++) {
			int bi= (k*arr[i])/maxele;
			bkt.get(bi).add(arr[i]);
		}
		
		for (int i=0; i<k;i++) {
			Collections.sort(bkt.get(i));
		}
		
		int index=0;
		for (int i=0;i<k;i++) {
			for (int j=0;j<bkt.get(i).size();j++) {
				arr[index]=bkt.get(i).get(j);
				index++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {30,40,10,80,5,12,70};
		int k=4;
		int n=arr.length;
		bsort(arr,k);
		
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
