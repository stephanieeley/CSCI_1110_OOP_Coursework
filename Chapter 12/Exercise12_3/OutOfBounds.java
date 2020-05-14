package Exercise12_3;

import java.util.Scanner;

//steph eley
//5.13.2020

public class OutOfBounds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int [] list = new int[100];
		//System.out.println(list.length);
		for(int p = 0; p < list.length; p++ ) {
			list[p] = (int)(Math.random() * 10000);
		}
		System.out.println("Enter an index: ");
		int number = input.nextInt();
		try{
			System.out.println("The number at index " + number + " is " + list[number]);
		}
		catch(Exception ex) {
			System.out.println("Index out of bounds. ");
		}
	}
}
