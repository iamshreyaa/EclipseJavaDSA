package recursion;

public class NaturalNoSum {
	static int nNatural(int n) {
		if (n==0) {
			return 0;
		}
		return n+nNatural(n-1);
		
	}
	public static void main(String[] args) {
		System.out.println(nNatural(3));
		
	}

}
