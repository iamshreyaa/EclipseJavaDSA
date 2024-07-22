package recursion;
import java.lang.Math;
public class RopeCuttingProblem {
	static int maxpieces(int n,int a,int b,int c) {
		if (n==0)
			return 0;
		if (n<0)
			return -1;
		int res1=Math.max(maxpieces(n-1,a,b,c),maxpieces(n-b,a,b,c));
		int res=Math.max(res1, maxpieces(n-c,a,b,c));
		if (res==-1)
			return -1;
		return res+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxpieces(5,2,5,1));
		
	}

}
