//Given an array the task is to cyclically rotate the array clockwise by one time.
//input :arr[] = {1,2,3,4,5}
package Test1;

public class P5 {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int i=0; i<arr.length; i++) {
		 for(int j=i-1;j<arr.length; --j){    
			 if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
		     }
		  }
	    }
		System.out.println("The array are rotate");
		for(int i=0;i<arr.length;i++) {
			System.out.println();
		}
   }
}
					
		
