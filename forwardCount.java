package recursion;

public class forwardCount {
	
	static void forwardCount1(int n) {
		if (n==0) {
			return;
		}
		forwardCount1(n-1);
		System.out.println(n+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forwardCount1(4);
	}

}
