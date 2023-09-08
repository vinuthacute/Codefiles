//Write a java program to find the factorial of a given number
// input int num = 5
package Test1;

public class p3 {

	public static void main(String[] args) {
		int i,fact=1;
		int num=5;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("The given number is a factorial"+ fact);
	}

}
