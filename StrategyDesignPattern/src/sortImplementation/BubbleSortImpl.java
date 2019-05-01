package sortImplementation;

import sortInterface.SortInterface;

public class BubbleSortImpl implements SortInterface {
	private int length;
	private int temp;
	
	@Override
	public int[] sort(int[] numbers) {
		length = numbers.length;
		
		for(int i = 0; i < length; i++) {
			for(int j = 0; j< length - 1; j++ ) {
				temp = numbers[j];
				if(temp > numbers[j+1]) {
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp; 
				}
			}
		}
		return numbers;
	}
}
