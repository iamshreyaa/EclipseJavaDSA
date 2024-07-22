package recursion;

public class reversalCount {

	static int reversalCount1(int n){
        if (n==0){
            return 0;
        }
        else{
            System.out.print(n+" ");
            return reversalCount1(n-1);
        }
    }
	public static void main(String[] args) {
		
        reversalCount1(5);
	}

}
