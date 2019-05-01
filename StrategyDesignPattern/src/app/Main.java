package app;

import java.util.Scanner;

import sortImplementation.BubbleSortImpl;
import sortInterface.SortInterface;

public class Main {
	private static final int SIZE_OF_LIST = 5;
	private static Scanner scanner = new Scanner(System.in);
	private static int[] numbers = new int[5];
	
	public static void main(String[] args) {
		
		System.out.println("Enter five numbers: ");

		for(int i = 0; i < SIZE_OF_LIST; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		SortContext context = new SortContext();
		context.set(new BubbleSortImpl());
		context.printSorted(numbers);
	}
}
