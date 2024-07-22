
public class MajorityElement1 {
	static int MajEle(int arr[]) {
		int res=0;
		for (int i=0;i<arr.length;i++) {
			int count=0;
			for (int j=i;j<arr.length;j++) {
				if (arr[j]==arr[i]) {
					count++;
					res=Math.max(count, res);
				}
			}
			if (res> (arr.length/2)) {
				return arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {8,7,6,8,6,6,6,6};
		System.out.println(MajEle(arr));
	}

}
