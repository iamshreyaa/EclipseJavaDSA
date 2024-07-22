package sorting;

public class IntersecionOfArray {
	static void intersection(int a[],int b[],int n,int m) {
		int i=0;int j=0;
		while (i<n && j<m) {
			if (i>0 && a[i]==a[i-1]) {
				i++;
				continue;
			}
			if (a[i]<b[j]) {
				i++;
			}
			if (a[i]>b[j]) {
				j++;
			}
			if (a[i]==b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
	}
	public static void main(String []args) {
		int a[]= {3,5,10,10,10,15,15,20};
		int b[]= {5,10,10,15,30};
		int n=a.length;
		int m=b.length;
		intersection(a,b,n,m);
	}
}
