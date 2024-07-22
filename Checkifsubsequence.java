package string;

public class Checkifsubsequence {
	
	public static boolean sequence(String s1,String s2,int n,int m) {
		int i=0;
		int j=0;
		while (i<n && j<m) {
			if (s1.charAt(i)==s2.charAt(j)) {
				i++;
				j++;
			}
			else {
				i++;
			}
		}
		return (j==m);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ABCDEF";
		String s2="ABE";
		int n=s1.length();
		int m=s2.length();
		sequence(s1,s2,n,m);
	}

}
