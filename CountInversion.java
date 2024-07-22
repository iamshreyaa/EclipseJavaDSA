package sorting;

public class CountInversion {
	static int count(int arr[],int l,int r) {
		int res=0;
		if (r>l) {
			int m=l+(r-l)/2;
			res = res + count(arr,l,m);
			res = res + count(arr,m+1,r);
			res = res + countandmerge(arr,l,m,r);
		}
		System.out.println(res);
		return res;
	}
	static int countandmerge(int arr[],int l,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		int res=0;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for (int i=0;i<n1;i++) {
			left[i]=arr[l+i];
		}
		for (int j=0;j<n2;j++) {
			right[j]=arr[m+1+j];
		}
		int i=0;
		int j=0; int k=l;
		
		while (i<n1 && j<n2) {
			if (left[i]<=right[j]) {
				arr[k]=left[i];
			}
			else {
				arr[k]=right[j];
				res=res+(n1-i);
			}
			k++;
		}
		while (i<n1) {
			arr[k]=left[i];
			k++;i++;
		}
		while (j<n2) {
			arr[k]=right[j];
			k++;j++;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,1,3,5};
		int n=arr.length;
		int l=0;
		int r=n-1;
		count(arr,l,r);
	}

}

