package otherJavas;

import java.util.Scanner;

public class Kaprecar {
	public static final int KAPRECAR = 6174;
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 4 digit number :");
		int number = in.nextInt();
		
		for(int a=0; a < 10; a++) {
			//Redix Sort algorithm
			int sortedNumber = 0;
			
			for(int i=9; i >=0; i--) {
				int tempNumber = number;
				while(tempNumber > 0) {
					int digit = tempNumber % 10;
					if(digit == i) {
						sortedNumber *= 10;
						sortedNumber += digit;
					}
					tempNumber /= 10;
				}
			}
			
			//Reverse Number
			int sortedNumberToReverse = sortedNumber;
			int reversed = 0;
			for(;sortedNumberToReverse != 0; sortedNumberToReverse /= 10) {
				int digit = sortedNumberToReverse % 10;
				reversed = reversed * 10 + digit;
			}
			
			int newNumber = sortedNumber - reversed;
			System.out.println((a+1) + ":" + newNumber);
			number = newNumber;
			
			if(number == KAPRECAR) {
				System.out.println("Kaprecar's Constant Reached in " + (a+1) + " iterations");
				a = 10;
			}
			
		}
		
	}

}
