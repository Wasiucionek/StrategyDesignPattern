package app;

import sortInterface.SortInterface;

public class SortContext {
	private SortInterface sorter;
	
	public void set(SortInterface sorter) {
		this.sorter = sorter;
	}
	
	public void printSorted(int[] numbers) {
		numbers = sorter.sort(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}