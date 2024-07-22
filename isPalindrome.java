package recursion;

public class isPalindrome {
	static boolean ispal(String str,int start,int end) {
		if (start>=end) {
			return true;
		}
		return(str.charAt(start)==str.charAt(end)) && ispal(str,start+1,end-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abba";
		int start=0;
		int end=str.length();
		System.out.println(ispal(str,start,end-1));
	}

}
