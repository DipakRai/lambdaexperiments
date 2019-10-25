package mulshankar13.lambdaexperiments;

import java.util.Scanner;

/**
 * Cracking The Coding Interview Moderate Probs
 * @author mulshankar13
 *
 */
public class SwapTwoNumbers {
	
	public static void main(String... args) {
		
		int n1,n2=0;
		Scanner sc1=new Scanner (System.in);
		
		n1=sc1.nextInt();
		n2=sc1.nextInt();
		System.out.println("n1 ="+n1 + " n2 ="+n2);
		
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("############Swapped###############");
		System.out.println("n1 ="+n1 + " n2 ="+n2);
		
		System.out.println("#########Bitwise Solution:Homecoming##########");
		
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		
		System.out.println("n1 ="+n1 + " n2 ="+n2);
	}

}
