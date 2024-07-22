package string;

public class LeftmostRepeatingString {
	//left most repeating character ka index
	//I/P-"geeksforgeeks"
	// O/P- 0
	public static int CHAR=256;
	public static int character(String s) {
		int n=s.length();
		boolean visited[]=new int[CHAR];
		for (int i=0;i<n;i++) {
			count[s.charAt(i)]++;
		}
		for (int i=0;i<n;i++) {
			if (count[i]>1) {
				return i;
			}
		}
		return -1;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
