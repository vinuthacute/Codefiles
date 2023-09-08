//Write a java program to check number is palindrome or not
 //input int num = 1221

package Test1;

public class P1 {

	public static void main(String[] args) {
		int r,temp,sum=0;
		int n = 1221;
		
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("It is a Palindrome");
		} else {
			System.out.println("It is not a Palindrome");
		}

	}

}
