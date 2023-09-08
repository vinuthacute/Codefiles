//Given an Array of non-negative Integers and a number. 
//int[] arr = {2,3,6,4,9,0,11};
//int num = 11;

package Test1;

public class P4 {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,6,4,9,0,11};
		int num = 11;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;i++) {
				if(arr[i]>arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
		}
	}
}

