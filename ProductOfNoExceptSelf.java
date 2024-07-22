
public class ProductOfNoExceptSelf {
	    public int[] productExceptSelf(int[] nums) {
	        int n=nums.length;
	        int left[]=new int[n];
	        int right[]=new int[n];
	        int output[]=new int[n];
	        left[0]=nums[0];
	        for (int i=1;i<n;i++){
	            left[i]=nums[i]*left[i-1];
	        }
	        right[n-1]=nums[n-1];
	        for (int i=n-2;i>=0;i--){
	            right[i]=nums[i]*right[i+1];
	        }
	        output[0]=right[1];
	        output[n-1]=left[n-2];
	        for (int i=1;i<n-1;i++){
	            output[i]=left[i-1]*right[i+1];
	        }
	        return output;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
