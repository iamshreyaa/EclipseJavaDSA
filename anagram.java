package string;

import java.util.Arrays;

public class anagram {
	public static boolean ifanagram(String s,String t,int n,int m) {
		if (n!=m) {
			return false;
		}
		char []a1=s.toCharArray();
		Arrays.sort(a1);
		s=new String(a1);
		
		char []a2=t.toCharArray();
		Arrays.sort(a2);
		t=new String(a2);
		if (s.equals(t)) {
			System.out.println("true");
		}
		return (s.equals(t));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="listen";
		String t="silent";
		int n=s.length();
		int m=t.length();
		ifanagram(s,t,n,m);
	}

}
