package java_practice;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public static void main(String[] args) {
		int n,r,c;
		int s=0;
		
		System.out.println("Enter Your Number : ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s) {
			System.out.println("It's palindrome Number...");
		}else {
			System.out.println("It's not palindrome Number.....");
		}
		
		
	}

}
