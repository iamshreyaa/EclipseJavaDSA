package recursion;

public class sumofdigit {
	static int getsum(int n){
		if(n==0) {
			return 0;
		}
		return getsum(n/10)+(n%10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getsum(121));
	}

}
