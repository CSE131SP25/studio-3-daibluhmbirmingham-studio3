package studio3;

import java.util.Scanner;

public class Sieve {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is the largest number? ");
		int n = in.nextInt();
		int[] numbers = new int[n];
		int [] prime= new int [n];
		for (int counter =0; counter< numbers.length; counter++) {
			numbers[counter]=counter+1;
			System.out.println(numbers[counter]);
		}
		
		for (int i =0; i< numbers.length; i++) {
		for (int startingNumber =2;startingNumber <= n; startingNumber ++) {

			
				int multiples = numbers[i]* startingNumber;
				for (int m=0; m < numbers.length; m++) {
				if (numbers[m] != multiples) {
					prime[m] = 0;
				
				}
					
			}	
			}
		
	
		}
		for (int i=0; i< numbers.length; i++) {
		System.out.println(prime[i]);
	}
	}
}
