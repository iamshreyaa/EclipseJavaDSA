//import java.util.*;
public class arrayLargestElement {

	public static void main(String[] args) {
		int arr[]= {5,10,20,1,6};
		int max=0;
		for (int i=1;i<arr.length;i++) {
			if (arr[i]>arr[max]) {
				max=i;
			}
			
		}
		System.out.println("max value is at index:"+max);

	}

}
